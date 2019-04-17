package com.mia.Test;

import java.util.ArrayList;

import com.mia.Method.Method;
import com.mia.Method.Http.Httpclient;
import com.mia.Method.Param.Bulid;
import com.mia.Method.Tools.JsonParse;
import com.mia.Method.Tools.RegexUntil;

public class Cart_delete {

	public static ArrayList<String> info(){

		ArrayList<String> List = new ArrayList<String>();
		String response = Httpclient.sendHttpPost("cart/info", Bulid.Params(1, ""));

		String code = JsonParse.code(response, "code");
		if (code.equals("200")) {
			List = RegexUntil.regexList("{\"id", "item_id", response);
		}
		return List;
	}

	public static void delete() {
		ArrayList<String> List = new ArrayList<String>();
		String response = null;
		response = Httpclient.sendHttpPost("cart/info", Bulid.Params(1, ""));
	
		String code = JsonParse.code(response, "code");
		if (code.equals("200")) {
			List = RegexUntil.regexList("\"id", ",", response);
		}
		if (List.size() > 0) {
			for (int i = 0; i < List.size(); i++) {
				String param = "row_id," + List.get(i);
				System.out.println(List.get(i));
				String params = Method.JsonParam(param);
				try {
					Httpclient.sendHttpPost("cart/delete", Bulid.Params(1, params));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			info();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
