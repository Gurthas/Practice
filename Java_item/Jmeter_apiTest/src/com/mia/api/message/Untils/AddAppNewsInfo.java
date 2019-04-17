package com.mia.api.message.Untils;

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

import com.mia.api.message.MessageService;
import com.mia.api.message.QueryParam;
import com.mia.api.message.RAddAppNews;



/**
 * 根据商品ID获取活动数据 key：itemId：活动ID，商品限购信息等，promotion：活动信息，ladder：阶梯信息
 * 
 * @param queryParam
 */

public class AddAppNewsInfo extends AbstractJavaSamplerClient {
	private TSocket socket;
	private TFramedTransport transport;
	private TProtocol protocol;
	private MessageService.Client client;
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
	private static int SERVER_PORT_DEFAULT = 9292;
	// 定义版本
	private String  version;
	private static String Version = "Version";
	private static String  Version_DEFAULT = "5_0_0";
	// 定义版本
	private String  clientType;
	private static String ClientType = "ClientType";
	private static String  ClientType_DEFAULT = "android";	
	// 定义用户ID
	private String  userid;
	private static String User_id = "User_id";
	private static int User_id_DEFAULT ;
	// 消息类型: 'single','all','group'  单一用户,全部,一组用户
	private String  type;
	private static String Type = "Type";
	private static String Type_DEFAULT = "single";
	// //消息信息相关类型：'group','outlets'   特卖，社交
	private String  resource_type;
	private static String Resource_type = "Resource_type";
	private static String Resource_type_DEFAULT = "outlets";
	// 消息信息相关子类型：'group','img_comment','img_like','follow','order','score','coupon','productDetail','freebuy','special','mibean','outletsList','wish_list_detail','wish_like','wish_comment','brand_info','super_wish_list','wish_list_category','redbag','collocation','wish_list_rebate','wish_list_reward','act_cute_record','act_cute_comment','act_cute_like','act_cute_detail','custom','collocation_detail' 
	//特卖、商品、代金券、积分、订单，图片、活动 、专题 、0元抢、其它、蜜豆、官方清单消息、清单贊消息、清单评论消息、品牌页、超级清单首页、清单分类页、红包页、搭配首页、搭配详情页、卖萌详情、卖萌赞、卖萌评论、卖萌收入、清单打赏、自定义、清单返利
	private String  resource_sub_type;
	private static String Resource_sub_type = "Resource_sub_type";
	private static String Resource_sub_type_DEFAULT = "order";
	// 自定义标题
	private String  custom_title;
	private static String Custom_title = "Custom_title";
	private static String Custom_title_DEFAULT = "";
	// 自定义图片
	private String  custom_photo;
	private static String Custom_photo = "Custom_photo";
	private static String Custom_photo_DEFAULT = "";
	// 自定义图片
	private String  custom_url;
	private static String Custom_url = "Custom_url";
	private static String Custom_url_DEFAULT = "";
	// 消息信息相关资源id
	private int  resource_id;
	private static String Resource_id = "Resource_id";
	private static int Resource_id_DEFAULT = 0;
	// 后台定义的uid或0用户发起的写发起人id
	private int  send_from_id;
	private static String Send_from_id = "Send_from_id";
	private static int Send_from_id_DEFAULT = 0;
		
		
		
		
	/*
	 * 设置传入的参数，可以设置多个，已设置的参数会显示到Jmeter的参数列表中
	 */
	@Override
	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		//// 定义一个参数，显示到Jmeter的参数列表中，第一个参数为参数默认的显示名称，第二个参数为默认值
		params.addArgument(IP, SERVER_IP_DEFAULT);
		params.addArgument(Port, Integer.toString(SERVER_PORT_DEFAULT));
		params.addArgument(Version, Version_DEFAULT);
		params.addArgument(ClientType, ClientType_DEFAULT);
		params.addArgument(User_id, Integer.toString(User_id_DEFAULT));
		params.addArgument(Type, Type_DEFAULT);
		params.addArgument(Resource_type, Resource_type_DEFAULT);
		params.addArgument(Resource_sub_type, Resource_sub_type_DEFAULT);
		params.addArgument(Custom_title, Custom_title_DEFAULT);
		params.addArgument(Custom_photo, Custom_photo_DEFAULT);
		params.addArgument(Custom_url, Custom_url_DEFAULT);
		params.addArgument(Resource_id, Integer.toString(Resource_id_DEFAULT));
		params.addArgument(Send_from_id, Integer.toString(Send_from_id_DEFAULT));
		return params;
	}

	private void setupValues(JavaSamplerContext context) {

		SERVER_IP = context.getParameter(IP, SERVER_IP_DEFAULT);
		SERVER_PORT = context.getIntParameter(Port, SERVER_PORT_DEFAULT);
		version = context.getParameter(Version, Version_DEFAULT);
		clientType = context.getParameter(ClientType, ClientType_DEFAULT);
		userid = context.getParameter(User_id, String.valueOf(User_id_DEFAULT));
		type = context.getParameter(Type, Type_DEFAULT);
		resource_type = context.getParameter(Resource_type, Resource_type_DEFAULT);
		resource_sub_type = context.getParameter(Resource_sub_type, Resource_sub_type_DEFAULT);
		custom_title = context.getParameter(Custom_title, Custom_title_DEFAULT);
		custom_photo = context.getParameter(Custom_photo, Custom_photo_DEFAULT);
		custom_url = context.getParameter(Custom_url, Custom_url_DEFAULT);
		resource_id = context.getIntParameter(Resource_id, Resource_id_DEFAULT);
		send_from_id = context.getIntParameter(Send_from_id, Send_from_id_DEFAULT);
		
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
		client = new MessageService.Client(protocol);

	}

	@SuppressWarnings("deprecation")
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult results = new SampleResult();
		results.setSampleLabel("getItemPromotionInfo");
		setupValues(context);
		
		version = context.getParameter(Version);
		userid = context.getParameter(User_id);
		clientType = context.getParameter(ClientType);
		type = context.getParameter(Type, Type_DEFAULT);
		resource_type = context.getParameter(Resource_type);
		resource_sub_type = context.getParameter(Resource_sub_type);
		custom_title = context.getParameter(Custom_title);
		custom_photo = context.getParameter(Custom_photo);
		custom_url = context.getParameter(Custom_url);
		resource_id = context.getIntParameter(Resource_id);
		send_from_id = context.getIntParameter(Send_from_id);
		QueryParam params = _QueryParam.params(userid, type, resource_type, resource_sub_type, custom_title, custom_photo, custom_url, resource_id, send_from_id, Version, ClientType);
		RAddAppNews result = null;
		// 定义一个事务，表示这是事务的起始点
		results.sampleStart();
		try {
			result = client.addAppNewsInfo(params);
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
			results.setResponseMessage("sucess");
			results.setSuccessful(true);
		}else{
			results.setResponseCode("Response code :" + result.getCode());
			results.setResponseData("Response Body :" + result);
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
