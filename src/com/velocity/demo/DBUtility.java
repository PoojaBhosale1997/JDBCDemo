package com.velocity.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	public static Connection makeConnection() {
		Connection conn=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("connection successful");
		return conn;
	}
	
	

}
