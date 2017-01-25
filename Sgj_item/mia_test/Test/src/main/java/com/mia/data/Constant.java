package com.mia.data;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;

import com.mia.DB.SqlUtils;
import com.mia.Test.Login;
import com.mia.Method.Method;
import com.mia.Method.Http.Httpclient;
import com.mia.Method.Tools.JsonParse;

/*
 * 动态获取数据，初始化相关数据，请求默认用户登录状态
 */
public class Constant {
	private static Logger log = LogManager.getLogger("Configuration");
	private static String filename = "src\\main\\java\\config\\config.json";
	public static final String Version;
	public static final String Channel;
	public static final String filePath = "c:/测试数据.xlsx";
	public static final String versionId;
	public static final String channel;
	public static final String userid;
	public static final String auth_session;
	public static final String app_id;
	public static final String secret;
	public static final String url;
	public static final String SingleItem_id;
	/*
	 * static{
	 * 
	 * log.info(
	 * "***************************开始初始化用户基本信息****************************************************"
	 * ); //PoiExcelHelper helper = PoiExcelUtils.getPoiExcelHelper(filePath);
	 * //固定位置数据，第二行，b列数据 //ArrayList<ArrayList<String>> dataList =
	 * helper.readExcel(filePath, 0, "2",new String[] {"b","c"});
	 * 
	 * // ArrayList<String> data = dataList.get(0); try { Version
	 * =SqlUtils.FristValue("Version"); log.info("初始化Version：" + Version); }
	 * catch (SQLException e) {
	 * 
	 * e.printStackTrace(); } //Version = data.get(0); //log.info("初始化Version："
	 * + Version); //Channel = data.get(1); //log.info("初始化Channel：" +Channel);
	 * try { Channel =SqlUtils.FristValue("Channel"); log.info("初始化Version：" +
	 * Channel); } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); } }
	 */

	static {
		log.info("***************************开始初始化用户基本信息****************************************************");
		
		//param = SqlUtils.FristValue("Version");
		Version = JsonParse.File(filename,"version");
		// log.info("初始化Version：" + Version);
		//Version = param;
		log.info("初始化Version：" + Version);
	}
	static {
		
		Channel = JsonParse.File(filename,"channel");
		log.info("初始化Channel：" + Channel);
	}
	static {
	
		SingleItem_id=JsonParse.File(filename,"add/SingleItem_id");
		log.info("初始化SingleItem_id：" + SingleItem_id);
	}
	static {
		/*String param = null;
		try {
			param = SqlUtils.FristValue("Channel");
		} catch (SQLException e) {
			System.exit(0);
		}*/
		url = JsonParse.File(filename,"http") + "://api.miyabaobei.com/";
		log.info("初始化url：" + url);
	}

	static {

		versionId = Method.Transform(Channel) + "_" + Version;
		log.info("初始化versionId：" + versionId);
		channel = Constant.Channel;
		log.info("初始化channel：" + channel);
		app_id = Method.Transform(Channel) + "_test_id";
		log.info("初始化app_id：" + app_id);
		secret = Method.Secret(Channel);
		log.info("初始化secret：" + secret);

	}
	static {
		String login = "";
		/*List<Map<String, Object>> params = null;
		try {
			params = SqlUtils.select("select * from test_config where name = 'users'");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// PoiExcelHelper helper = PoiExcelUtils.getPoiExcelHelper(filePath);
		// ArrayList<ArrayList<String>> dataList = helper.readExcel(filePath, 0,
		// "4-",new String[] {"b","c"});
		// ArrayList<String> data = dataList.get(0);
		// log.info("初始化用户信息：" + data);

		String name = params.get(0).get("value").toString();
		String pwd = params.get(0).get("value2").toString();*/
		String name = JsonParse.File(filename,"user");
		String pwd = JsonParse.File(filename,"pwd");
		try {
			login = Login.account_login(name, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}
		String response = Httpclient.sendHttpPost("account/login/", login);
		try {
			String code = JsonParse.code(response, "code");
			if (!code.equals("200")) {
				System.out.println(response);
				log.info("初始化用户失败，无法获取用户信息，接口错误Code：" + code);
				System.exit(0);
			}
		} catch (Exception e) {
			log.info("初始化用户失败，无法获取用户信息");
			System.exit(0);
		}
		userid = JsonParse.code(response, "content/user_id");
		auth_session = JsonParse.code(response, "content/auth_session");
		log.info("初始化userid：" + userid);
		log.info("初始化auth_session：" + auth_session);
		if (userid == null || auth_session.equals("no_have_loginnameuser_id0is_id_verified0")) {
			log.info("初始化用户失败，无法获取用户信息，请检查测试用户是否正确");
			System.exit(0);

		}
		log.info("***************************初始化用户基本信息结束****************************************************");
	}

}
