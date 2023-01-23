package com.velocity.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class PreparedStatementsDemo {

	public static void main(String[] args){
		String query="insert into demo(id,name)values(?,?)";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test","root","root");
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, 2);
			pstmt.setString(2, "pranati");
			pstmt.executeUpdate();
			System.out.println("success.....");
			
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
