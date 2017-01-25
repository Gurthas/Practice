package com.mia.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SqlUtils {
	private static Logger log = LogManager.getLogger("SqlUtils");
	// public static Connection conn = DBUtils.Connection();

	/*
	 * 更新删除操作 statement 待执行SQL语句
	 */
	public static void update(String satement)  {
		Connection conn = DBUtils.Connection();
		QueryRunner Runner = new QueryRunner();
		int count;

		try {
			count=Runner.update(conn, satement);
			
			log.info("Update 执行成功，影响行数: " + count + "\n SQL：" + satement);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			log.info("SQL执行失败：" + satement +"\n失败信息：" + e);
		}

		DBUtils.Close(conn);

	}

	/*
	 * 查询操作 statement 待执行SQL语句
	 */
	public static List<Map<String, Object>> select(String satement){
		Connection conn = DBUtils.Connection();
		QueryRunner Runner = new QueryRunner();

		List<Map<String, Object>> params = null;
		try {
			params = Runner.query(conn, satement, new MapListHandler());
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			log.info("SQL执行失败：" + satement +"\n失败信息：" + e);
		}
		DBUtils.Close(conn);
		return params;

	}
	/*
	 * 查询操作 statement 待执行SQL语句
	 */
	public static int  id(String satement){
		
		Connection conn = DBUtils.Connection();
		QueryRunner Runner = new QueryRunner();

		List<Map<String, Object>> params = null;
		try {
			params = Runner.query(conn, satement, new MapListHandler());
		
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			log.info("SQL执行失败：" + satement +"\n失败信息：" + e);
		}
		DBUtils.Close(conn);
		return params.size();

	}

	/*
	 * 数据储存操作，批量插入数据库
	 */
	public static void update(String satemen, Object[] params) {
		Connection conn = DBUtils.Connection();
		QueryRunner Runner = new QueryRunner();
		try {
			Runner.update(conn, satemen, params);
		} catch (SQLException e) {
			log.info("SQL执行失败：" + satemen + "\t" +params  +"\n失败信息：" + e);
		}
		DBUtils.Close(conn);

	}

	/*
	 * 单一value值信息
	 */
	public static String FristValue(String Value)  {
		Connection conn = DBUtils.Connection();
		QueryRunner Runner = new QueryRunner();
		String Sql = "select value   from test_config where   name='" + Value + "';";
		// List<String> param = new ArrayList<>();
		try {
			Object[] arrayResult = Runner.query(conn, Sql, new ArrayHandler());
			String param = null;
			if (arrayResult.length > 0)
				param = arrayResult[0].toString();

			return param;
		} catch (SQLException e) {

			log.info("SQL执行失败：" + Sql + "\t" +Value  +"\n失败信息：" + e);
			return null;
		} finally {
			DBUtils.Close(conn);
		}
	}

	public static void main(String[] args) {
		List<Map<String, Object>> params = select("select * from test_config where name = 'users'");
		Map<String, Object> map = params.get(0);
		String param = map.get("value").toString();
		System.out.println(param);
	}
}
