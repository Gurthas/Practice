package com.mia.Method.Tools;

import org.yaml.snakeyaml.Yaml;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Map;

public class YamlUntils {
	public static void main(String[] args) {
		Yaml yaml = new Yaml();
		Map map = null;
		try {

			URL url = YamlUntils.class.getClassLoader().getResource("./config/config.yaml");
			if (url != null) {
				// 可以将值转换为Map
				map = (Map) yaml.load(new FileInputStream(url.getFile()));

				System.out.println(map);
				// 通过map我们取值就可以了.

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(map.get("basic").toString());
		Object obj = map.get("basic");
		// JSONObject obj =JSON.parseObject(map.get("basic").toString());
		System.out.println(obj);

	}

}
