package com.mia.order.tApi.Untils;


import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import com.mia.order.tApi.CommonParams;
import com.mia.order.tApi.TOrderApiService;
import com.mia.order.tApi.TParamsOrderList;
import com.mia.order.tApi.TResultOrderList;

public class OrderList extends AbstractJavaSamplerClient {

	
	private TSocket socket;
	private TFramedTransport transport;
	private TProtocol protocol;
	private TMultiplexedProtocol tMultiplexedProtocol;
	private TOrderApiService.Client client;
	/*
	 * 客户端参数信息：接口IP 接口Port 接口服务名称
	 */
	// 定义服务IP地址
	private String SERVER_IP;
	private static String IP = "SERVER_IP";
	private static String SERVER_IP_DEFAULT = "10.0.1.155";
	// 定义端口号
	private int SERVER_PORT;
	private static String Port = "SERVER_PORT";
	private static int SERVER_PORT_DEFAULT = 82;
	// 定义服务名称
	private String Service;
	private static String Service_Name = "Service_Name";
	private static String Service_Name_DEFAULT = "order_api_service_v1.0";
	/*
	 * 定义服务公共参数，测试过程中只需确定api版本即可，其他参数业务封装并反显
	 */

	public String appVersion;
	private static String appVersion_ID = "appVersion";
	private static String appVersion_ID_DEFAULT = "5_0_0";
	/*
	 * 定义业务参数信息
	 */
	// 定义用户ID
	private int UserId;
	private static String User_ID = "UserId";
	private static int User_ID_DEFAULT = 0;
	// 定义当前第几页
	private int Page;
	private static String Page_ID = "Page";
	private static int Page_ID_DEFAULT = 1;
	// 定义每页显示数量
	private int PageSize;
	private static String PageSize_ID = "PageSize";
	private static int PageSize_ID_DEFAULT = 10;
	// 定义订单类型
	private int Type;
	private static String Type_ID = "Type";
	private static int Type_ID_DEFAULT = 1;
	// 定义订单状态
	private int Status;
	private static String Status_ID = "Status";
	private static int Status_ID_DEFAULT = 1;
	// 定义订单来源
	private int ClientSource;
	private static String ClientSource_ID = "ClientSource";
	private static int ClientSource_ID_DEFAULT = 1;

	private void setupValues(JavaSamplerContext context) {

		SERVER_IP = context.getParameter(IP, SERVER_IP_DEFAULT);
		SERVER_PORT = context.getIntParameter(Port, SERVER_PORT_DEFAULT);
		Service = context.getParameter(Service_Name, Service_Name_DEFAULT);
		appVersion = context.getParameter(appVersion_ID, appVersion_ID_DEFAULT);
		UserId = context.getIntParameter(User_ID, User_ID_DEFAULT);
		Page = context.getIntParameter(Page_ID, Page_ID_DEFAULT);
		PageSize = context.getIntParameter(PageSize_ID, PageSize_ID_DEFAULT);
		Type = context.getIntParameter(Type_ID, Type_ID_DEFAULT);
		Status = context.getIntParameter(Status_ID, Status_ID_DEFAULT);
		ClientSource = context.getIntParameter(ClientSource_ID, ClientSource_ID_DEFAULT);
	}

	/*
	 * 设置传入的参数，可以设置多个，已设置的参数会显示到Jmeter的参数列表中
	 */
	@Override
	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		//// 定义一个参数，显示到Jmeter的参数列表中，第一个参数为参数默认的显示名称，第二个参数为默认值
		params.addArgument(IP, SERVER_IP_DEFAULT);
		// Integer.toString(b)(b)
		params.addArgument(Port, Integer.toString(SERVER_PORT_DEFAULT));
		params.addArgument(Service_Name, Service_Name_DEFAULT);
		params.addArgument(appVersion_ID, appVersion_ID_DEFAULT);
		params.addArgument(User_ID, Integer.toString(User_ID_DEFAULT));
		params.addArgument(Page_ID, Integer.toString(Page_ID_DEFAULT));
		params.addArgument(PageSize_ID, Integer.toString(PageSize_ID_DEFAULT));
		params.addArgument(Type_ID, Integer.toString(Type_ID_DEFAULT));
		params.addArgument(Status_ID, Integer.toString(Status_ID_DEFAULT));
		params.addArgument(ClientSource_ID, Integer.toString(ClientSource_ID_DEFAULT));
		return params;
	}

	/*
	 * //初始化方法，实际运行时每个线程仅执行一次，在测试方法运行前执行，类似于LoadRunner中的init方法 （非 Javadoc）
	 * 
	 * @see org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient#
	 * setupTest(org.apache.jmeter.protocol.java.sampler.JavaSamplerContext)
	 */
	 @Override
	public void setupTest(JavaSamplerContext arg0) {
		SERVER_IP = arg0.getParameter("SERVER_IP");
		SERVER_PORT = arg0.getIntParameter("SERVER_PORT");
		Service = arg0.getParameter("Service_Name");

		// Socket层
		socket = new TSocket(SERVER_IP, SERVER_PORT);
		// 传输层
		transport = new TFramedTransport(socket);

		try {
			transport.open();
		} catch (TTransportException e) {
			transport.close();
			throw new RuntimeException(e);
		}
		// 传输协议
		protocol = new TCompactProtocol(transport);
		// 定义调用的服务
		tMultiplexedProtocol = new TMultiplexedProtocol(protocol, Service);
		// 客户端
		client = new TOrderApiService.Client(tMultiplexedProtocol);
	}
	@Override
	@SuppressWarnings({ "null", "deprecation" })
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult results = new SampleResult();
		setupValues(context);
		// 生成CommonParams公共参数appVersion
		// CommonParams commonParams =
		// _CommonParams.params(context.getParameter(appVersion_ID));
		CommonParams commonParams = _CommonParams.params(appVersion);

		/*
		 * int userId = intParam(context.getParameter(User_ID)) ; int page =
		 * intParam(context.getParameter(Page_ID)) ; int pageSize =
		 * intParam(context.getParameter(PageSize_ID)) ; int type =
		 * intParam(context.getParameter(Type_ID)) ; int status =
		 * intParam(context.getParameter(Status_ID)) ; int clientSource =
		 * intParam(context.getParameter(ClientSource_ID)) ;
		 */
		// TParamsOrderList OrderListParams = _TParamsOrderList.params(userId,
		// page, pageSize, type, status, clientSource);
		TParamsOrderList OrderListParams = _TParamsOrderList.params(UserId, Page, PageSize, Type, Status, ClientSource);
		
		// 定义一个事务，表示这是事务的起始点
		results.sampleStart();
		TResultOrderList result = null;
		try {

			result = client.orderList(OrderListParams, commonParams);
		} catch (TException e) {

			e.printStackTrace();
		}
		// 定义事务，标志事务结束
		results.sampleEnd();
		results.setDataType(SampleResult.TEXT);
		results.setDataEncoding("UTF-8");
		results.setSamplerData(OrderListParams.toString());
		results.setSampleLabel("orderList");
		// 判断
		if (result == null && result.isSetCode() == false && result.getCode() != 200) {
			results.setResponseCode("Response Code" + result.getCode());
			results.setResponseData("Response Body" + result.toString());
			results.setResponseMessage("false");
			results.setSuccessful(false);
		} else if(result.getCode() ==200){

			results.setResponseCode("200");
			results.setResponseData("Response Body" + result.toString());
			results.setResponseMessage("true");
			results.setSuccessful(true);
		}else{
			results.setResponseCode("Response Code" + result.getCode());
			results.setResponseData("Response Body" + result.toString());
			results.setResponseMessage("false");
			results.setSuccessful(false);	
		}
		return results;

	}

	public void teardownTest(JavaSamplerContext context) {
		super.teardownTest(context);
		transport.close();
		socket.close();
	}

	public int intParam(String param) {
		int a = 0;
		try {
			a = Integer.parseInt(param);
			System.out.println(a);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return a;

	}
}
