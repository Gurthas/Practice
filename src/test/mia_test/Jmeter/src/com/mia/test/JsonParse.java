package com.mia.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class JsonParse {
	
	//private static String filename = "src\\main\\java\\config\\config.json";
	// private Map<String, Object> oneResult = new TreeMap<String, Object>();



	/*
	 * 只解析第一层json Json 解析方法 : 获取code码, result Json原始字符串
	 */

	public static String code(String result) {
		JSONObject jsonObject = JSON.parseObject(result);
		String code = jsonObject.get("code").toString();
		return code;
	}

	/*
	 * 解析json数据，解析对象含有JSONArray、jsonobject时无效，会抛出错误信息
	 */
	public static String code(String result, String key) {
		Object code = null;
		JSONObject jsonObject = JSON.parseObject(result);
		String[] maptxt = key.split("/");
		try {
			for (int i = 0; i < maptxt.length; i++) {
				if (i == (maptxt.length - 1)) {
					code = jsonObject.get(maptxt[i]);
					break;
				}
				code = jsonObject.getJSONObject(maptxt[i]);
				jsonObject = JSON.parseObject(code.toString());
			}
		} catch (Exception e) {
			code = null;
			
		}
		return code.toString();

	}

	/*
	 * 解析json数据，解析对象含有JSONArray
	 */
	public static String key(String result, String key) {
		Object value = null;

		JSONArray Jarray = new JSONArray();
		JSONObject jsonObject = JSON.parseObject(result);
		String[] maptxt = key.split("/");
		try {
			for (int i = 0; i < maptxt.length; i++) {

				if (jsonObject.toString().charAt(0) == '{') {
					if (i == (maptxt.length - 1)) {

						value = jsonObject.get(maptxt[i]);
						break;
					}
					System.out.println(maptxt[i]);

					value = jsonObject.get(maptxt[i]);
					System.out.println("122" + value);
					if (value.toString().charAt(0) == '[') {
						if(Jarray.size()>1){
							System.out.println("*****" + Jarray);
							break;
						}
						Jarray = JSONArray.parseArray(value.toString());
						System.out.println("125" + Jarray);
						jsonObject = JSON.parseObject(Jarray.get(0).toString());
						
					} else {
						jsonObject = JSON.parseObject(value.toString());
						System.out.println("128" + jsonObject);
					}
				} else {
					System.out.println(maptxt[i]);
					System.out.println(Jarray.size());
					Jarray = JSONArray.parseArray(jsonObject.toString());
					System.out.println("133" + Jarray);
					jsonObject = JSON.parseObject(Jarray.get(0).toString());

					value = jsonObject.get(maptxt[i]);
					System.out.println("137" + value);
					jsonObject = JSON.parseObject(value.toString());
				}

			}
		} catch (Exception e) {
			value = null;
			
		}
		return value.toString();

	}

	// 可以解析出所有字段，key/Value
	public static Map<String, String> map(String result) {
		Map<String, String> map = new HashMap<String, String>();
		LinkedHashMap<String, String> jsonMap = JSON.parseObject(result,
				new TypeReference<LinkedHashMap<String, String>>() {
				});

		for (Map.Entry<String, String> entry : jsonMap.entrySet()) {

			if (entry.getValue().endsWith("}") || entry.getValue().endsWith("]")) {
				map(entry.getValue().replace("[", "").replace("]", ""));
			} else {
				System.out.println(entry.getKey() + ":" + entry.getValue());
				map.put(entry.getKey(), entry.getValue());
			}
		}
		return map;

	}

	public static void main(String[] args) {
		// System.out.println(File("add/SingleItem_id"));
		String str = "{\"content\":{\"cart_msgs\":[],\"invalid_item\":[],\"cart_total\":{\"select_quantity\":2,\"freight_tax_name\":\"不含运费和进口税\",\"is_select_all\":1,\"settle_amount\":214},\"official_total\":2,\"row_infos\":[{\"is_valid_store\":0,\"store_id\":0,\"item_group\":[{\"items\":[{\"gift\":\"\",\"warehouse_id\":\"96\",\"spec_show\":\"\",\"is_select\":1,\"store_id\":\"6666\",\"item_quantity\":1,\"item_sale_price\":\"96.00\",\"item_stock\":99,\"item_size\":\"SINGLE\",\"id\":\"148361324829898\",\"is_spu\":\"0\",\"warehouse_type\":\"1\",\"item_name\":\"大王 GOO.N 维E 纸尿裤（S 84片）\",\"item_id\":\"1000033\",\"item_market_price\":\"188.00\",\"item_pic\":\"https://img.miyabaobei.com/item/10/1000/1000033_normal_2.jpg\",\"promotion_tag\":0}]},{\"full_diff_money\":\"已满足【4.9拼团活动】\",\"items\":[{\"gift\":\"\",\"warehouse_id\":\"40\",\"spec_show\":\"\",\"is_select\":1,\"store_id\":\"1192\",\"item_quantity\":1,\"item_sale_price\":\"118.00\",\"item_stock\":62,\"item_size\":\"SINGLE\",\"id\":\"148361324572345\",\"promotion_lists\":[{\"reduce_money\":\"0\",\"preheating_time\":\"0000-00-00 00:00:00\",\"department_id\":\"8\",\"to_create_outlet\":\"1\",\"warehouse_ids\":\"\",\"n_item\":\"3\",\"type\":\"get_coupon\",\"id\":\"1111616\",\"activity_dynamics\":\"满0可用22元券\",\"title\":\"4.9拼团活动\",\"icon_id\":\"0\",\"discount_sign\":\"用券\",\"limit_stock\":\"-1\",\"to_create_special\":\"0\",\"exten\":\"4.9拼团活动\",\"app_url\":\"\",\"price_limit\":\"no\",\"is_preheating\":\"0\",\"m_money\":\"80\",\"full_money_type\":\"0\",\"outlet_pattern\":\"1\",\"cron_status\":\"0\",\"promotion_ownership\":\"1\",\"is_channel\":\"0\",\"account_type\":\"0\",\"supplier_id\":\"0\",\"max_buy\":\"-1\",\"status\":\"3\",\"web_url\":\"\",\"label_id\":\"1\",\"full_money\":\"0\",\"intro\":\"再删，就查你啦！\",\"discount\":\"0.00\",\"shoppingcart_dimension\":\"1\",\"pop_select_goods\":\"1\",\"outlet_type\":\"1\",\"update_time\":\"2016-12-16 17:47:35\",\"end_time\":\"2017-09-01 00:00:00\",\"create_time\":\"2016-03-23 14:21:58\",\"start_time\":\"2016-10-17 10:00:00\",\"outlet_id\":\"0\",\"preheating_intro\":\"\",\"is_support_pop\":\"-1\",\"choose_end_time\":\"2016-05-22 00:00:00\",\"h5_url\":\"\",\"day_limited\":\"-1\",\"sent_pop\":\"0\",\"promotion_force\":\"\"}],\"is_spu\":\"0\",\"warehouse_type\":\"1\",\"item_name\":\"啾啾  CHUCHU 1000155请勿动-吸管杯\",\"item_id\":\"1000155\",\"item_market_price\":\"130.00\",\"item_pic\":\"https://img.miyabaobei.com/item/10/1000/1000155_normal_2.jpg\",\"promotion_tag\":\"1111616\"}],\"promotion\":{\"reduce_money\":\"0\",\"preheating_time\":\"0000-00-00 00:00:00\",\"department_id\":\"8\",\"to_create_outlet\":\"1\",\"warehouse_ids\":\"\",\"n_item\":\"3\",\"type\":\"get_coupon\",\"is_valid\":true,\"id\":\"1111616\",\"activity_dynamics\":\"满0可用22元券\",\"title\":\"4.9拼团活动\",\"icon_id\":\"0\",\"discount_sign\":\"用券\",\"limit_stock\":\"-1\",\"to_create_special\":\"0\",\"exten\":\"4.9拼团活动\",\"app_url\":\"\",\"price_limit\":\"no\",\"is_preheating\":\"0\",\"m_money\":\"80\",\"full_money_type\":\"0\",\"outlet_pattern\":\"1\",\"cron_status\":\"0\",\"promotion_ownership\":\"1\",\"is_channel\":\"0\",\"account_type\":\"0\",\"supplier_id\":\"0\",\"max_buy\":\"-1\",\"status\":\"3\",\"web_url\":\"\",\"label_id\":\"1\",\"full_money\":\"0\",\"intro\":\"再删，就查你啦！\",\"discount\":\"0.00\",\"pop_select_goods\":\"1\",\"outlet_type\":\"1\",\"update_time\":\"2016-12-16 17:47:35\",\"end_time\":\"2017-09-01 00:00:00\",\"create_time\":\"2016-03-23 14:21:58\",\"start_time\":\"2016-10-17 10:00:00\",\"outlet_id\":\"0\",\"preheating_intro\":\"\",\"is_support_pop\":\"-1\",\"choose_end_time\":\"2016-05-22 00:00:00\",\"h5_url\":\"\",\"day_limited\":\"-1\",\"sent_pop\":\"0\",\"promotion_force\":\"\"}}],\"check_all\":1,\"store_name\":\"蜜芽自营\",\"is_special\":0}]},\"alert\":\"操作成功!\",\"code\":200,\"msg\":\"\"}";
		String txt = "content/row_infos/item_group/items/id";
		// System.out.println("code测试json解析：" + code(str,"content/row_infos"));
		System.out.println("测试json解析：" + key(str, txt));
		// JSONArray jarry = JSONArray.parseArray(code(str, txt));
		// System.out.println("测试json解析：" + jarry.toString());
		// String item_group= code(jarry.get(0).toString(),"item_group");
		// jarry =JSONArray.parseArray(item_group);
		// String items= code(jarry.get(0).toString(),"items");
		// jarry =JSONArray.parseArray(items);
		// System.out.println("测试item_group解析：" + items);
		// String id= code(jarry.get(0).toString(),"id");
		// System.out.println("测试id解析：" + id);
		// JSONArray json = JSON.parseArray(str);
		// Map<String, String> map = new HashMap<String, String>();
		// map = map(str);
		// System.out.println(map);

	}
}
