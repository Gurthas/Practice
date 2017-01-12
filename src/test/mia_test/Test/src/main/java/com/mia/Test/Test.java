package com.mia.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mia.Method.Http.Httpclient;
import com.mia.Method.Param.Bulid;

public class Test {
	private static Logger log = LogManager.getLogger("Test");

	public static String checkout(String url, String param) {
		String request = "{}";		
		request = Bulid.Params(1, param);	
		String response = Httpclient.sendHttpPost(url, request);
		return response;

	}
	

	/*
	 * public static void main(String[] args) { StringBuffer sb = new
	 * StringBuffer(); sb.append("\t\t佛曰\n"); sb.append(
	 * "\t\t\t佛祖保佑   		   永无BUG\n"); sb.append("\t\t\t写字楼里写字间，写字间里程序员； \n"
	 * ); sb.append("\t\t\t程序人员写程序，又拿程序换酒钱。\n");
	 * sb.append("\t\t\t酒醒只在网上坐，酒醉还来网下眠；\n");
	 * sb.append("\t\t\t酒醉酒醒日复日，网上网下年复年。\n");
	 * sb.append("\t\t\t但愿老死电脑间，不愿鞠躬老板前；\n");
	 * sb.append("\t\t\t奔驰宝马贵者趣，公交自行程序员。\n");
	 * sb.append("\t\t\t别人笑我忒疯癫，我笑自己命太贱；\n");
	 * sb.append("\t\t\t不见满街漂亮妹，哪个归得程序员？\n"); System.out.println(sb.toString());
	 * List<String> list = new ArrayList<String>(); list.add("a1");
	 * list.add("b2"); list.add("c3"); for (Iterator<String> iter =
	 * list.iterator(); iter.hasNext();) { System.out.println(iter.next()); }
	 * Map<String, String> map = new HashMap<String, String>(); map.put("1",
	 * "a1"); map.put("2", "b2"); map.put("3", "c3");
	 * 
	 * for (Map.Entry<String, String> entry : map.entrySet()) {
	 * System.out.println(entry.getKey() + ":" + entry.getValue()); } }
	 */
}
