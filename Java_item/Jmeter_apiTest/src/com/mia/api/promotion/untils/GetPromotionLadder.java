package com.mia.api.promotion.untils;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import com.mia.api.promotion.PromotionService;
import com.mia.api.promotion.QueryParam;
import com.mia.api.promotion.RPromotionLadder;
import com.mia.api.promotion.RPromotionList;

/**
 * 根据活动ID获取阶梯信息 key：promotionId，value：ladderInfo
 * 
 * @param queryParam
 */

public class GetPromotionLadder extends AbstractJavaSamplerClient {
	private TSocket socket;
	private TFramedTransport transport;
	private TProtocol protocol;
	private PromotionService.Client client;
	/*
	 * 客户端参数信息：接口IP 接口Port 接口服务名称
	 */
	// 定义服务IP地址
	private String SERVER_IP;
	private static String IP = "SERVER_IP";
	private static String SERVER_IP_DEFAULT = "172.16.96.33";
	// 定义端口号
	private int SERVER_PORT;
	private static String Port = "SERVER_PORT";
	private static int SERVER_PORT_DEFAULT = 8181;
	// 定义测试参数
	private String Param_List;
	private static String Param_Name = "Param_List";
	private static String Param_List_DEFAULT = "";

	/*
	 * 设置传入的参数，可以设置多个，已设置的参数会显示到Jmeter的参数列表中
	 */
	@Override
	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		//// 定义一个参数，显示到Jmeter的参数列表中，第一个参数为参数默认的显示名称，第二个参数为默认值
		params.addArgument(IP, SERVER_IP_DEFAULT);
		params.addArgument(Port, Integer.toString(SERVER_PORT_DEFAULT));
		params.addArgument(Param_Name, Param_List_DEFAULT);
		return params;
	}

	private void setupValues(JavaSamplerContext context) {

		SERVER_IP = context.getParameter(IP, SERVER_IP_DEFAULT);
		SERVER_PORT = context.getIntParameter(Port, SERVER_PORT_DEFAULT);
		Param_List = context.getParameter(Param_Name, Param_List_DEFAULT);
	}

	/*
	 * //初始化方法，实际运行时每个线程仅执行一次，在测试方法运行前执行，类似于LoadRunner中的init方法 （非 Javadoc）
	 * 
	 * @see org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient#
	 * setupTest(org.apache.jmeter.protocol.java.sampler.JavaSamplerContext)
	 */

	public void setupTest(JavaSamplerContext arg0) {

		SERVER_PORT = arg0.getIntParameter("SERVER_PORT");
		SERVER_IP = arg0.getParameter("SERVER_IP");
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
		// tMultiplexedProtocol = new TMultiplexedProtocol(protocol, Service);
		// 客户端
		client = new PromotionService.Client(protocol);

	}

	@SuppressWarnings("deprecation")
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult results = new SampleResult();
		results.setSampleLabel("getPromotionLadder");
		setupValues(context);
		Param_List = context.getParameter(Param_Name);
		QueryParam params = _QueryParam.params(Param_List);
		RPromotionLadder result = null;
		// 定义一个事务，表示这是事务的起始点
		results.sampleStart();
		try {
			result = client.getPromotionLadder(params);
		} catch (TException e) {
			e.printStackTrace();
		}
		// 定义事务，标志事务结束
		results.sampleEnd();
		results.setDataEncoding("UTF-8");
		results.setSamplerData(params.toString());
		// 判断
		if (result == null) {
			results.setResponseCode("0000" );
			results.setResponseData("测试结果为空，请检查请求数据以及查看服务器日志" );	
			results.setResponseMessage("false");
			results.setSuccessful(false);
		} else if(result.getCode() == 200){
			
			results.setResponseCode("200");
			results.setResponseData("Response Body" + result);
			results.setResponseMessage("ok");
			results.setSuccessful(true);
		}else{
			results.setResponseCode("Response Code:" + result.getCode());
			results.setResponseData("Response Body" + result);
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
}
