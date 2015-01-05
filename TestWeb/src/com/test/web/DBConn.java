package com.test.web;

import java.sql.Connection;
import java.sql.DriverManager;

class DBConn {
	private final String DBDRIVER = "com.mysql.jdbc.Driver";
	private final String DBURL = "jdbc:mysql://localhost:3306/testweb";
	private final String DBUSER = "root";
	private final String DBPASS = "root";
	private Connection con = null;

	public DBConn() {
		try {
			Class.forName(DBDRIVER);
			this.con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			con.setAutoCommit(false);
		} catch (Exception e) {
			System.out.println("连接数据库出现错误:" + e.getMessage());
		}
	}

	public Connection getConnection() {
		return this.con;
	}

	public void close() {
		try {
			if (!this.con.isClosed())
				this.con.close();
		} catch (Exception e) {
			System.out.println("数据库关闭出现异常：" + e.getMessage());
		}
	}
}