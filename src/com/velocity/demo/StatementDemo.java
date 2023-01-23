package com.velocity.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		String sql = "insert into user (lastName,firstName,address,city,salary)"+ 
				"values('pawar','ram','sangavi','pune',5000)";
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				Statement statement = con.createStatement();
				statement.execute(sql);
				System.out.println("Insertion successfully...");
				con.close();
				statement.close();
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
