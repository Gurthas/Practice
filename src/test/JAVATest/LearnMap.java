package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "德哥");
		map.put("b", "鹏先生");
		map.put("c", "老司机");
		map.put("d", "kaybro");

		// 方法1 keySet
		for (String key : map.keySet()) {
			System.out.println("key= " + key + " and value= " + map.get(key));

		// 方法2 entrySet foreach
		for (Map.Entry<String, String> entry : map.entrySet()) {
				System.out.println(("key= " + entry.getKey() + " and value= " + entry.getValue()));
			}
		
		//方法3 迭代器 Iterator
		Iterator <Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry = it.next();
			System.out.println(entry.getKey()+": "+entry.getValue());
			
		}
		

		}

	}


