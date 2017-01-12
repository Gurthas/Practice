package com.mia.DB;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class test {
	public static void main(String[] args) {

		String sql = "INSERT INTO test(name,content) VALUES('123','123')";
		SqlUtils.update(sql);
		List<Map<String, Object>> params = null;
		String sql1 = "select * from  msg_list  where  user_id='2109175'";
		params = SqlUtils.select(sql1);
		params.get(0);
		System.out.println(params.get(0));
	}

}
