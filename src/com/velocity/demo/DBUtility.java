package com.velocity.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	public static Connection makeConnection() {
		System.out.println("hiii");
		System.out.println("hello");
		Connection conn=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
	}
	
	

}
