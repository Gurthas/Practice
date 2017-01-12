package com.mia.DB;

import java.sql.*;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBUtils {
	private static Logger log = LogManager.getLogger("MysqlConnect");
	public static String url;
	public static String username;
	public static String password;
	public static String DRIVER;
	private static ResourceBundle config = ResourceBundle.getBundle("dbconfig");

	static {
		url = config.getString("jdbc.url");
		username = config.getString("jdbc.username");
		password = config.getString("jdbc.password");
		DRIVER = config.getString("jdbc.driver");
		try {
			Class.forName(DRIVER);

		} catch (ClassNotFoundException e) {
			log.error("JDBC 驱动加载失败！！");
			e.printStackTrace();
		}
	}
	// 创建数据库连接
	public static Connection Connection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException sqlex) {
			log.error("无法连接数据库！！" + url + username + password);
			sqlex.printStackTrace();
		}

		return conn;
	}

	// 数据库断开连接
	public static void Close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			log.info("数据库连接断开失败：");
			e.printStackTrace();
		}
	}
}
