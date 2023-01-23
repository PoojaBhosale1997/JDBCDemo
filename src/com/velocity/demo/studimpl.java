package com.velocity.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class studimpl{
	Connection conn=DBUtility.makeConnection();
	PreparedStatement ps;
	String query;
	int i;
	public boolean insertstud(stud s) {
		query="insert into stud(rno,name)values(?,?)";
		
		try {
			ps=conn.prepareStatement(query);
			
			ps.setInt(1, s.getRno());
			ps.setString(2, s.getName());
			
			i=ps.executeUpdate();
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean updatestud(stud s){
		query ="update stud set name=? where rno=?";
		try {
			ps=conn.prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setInt(2, s.getRno());
			i=ps.executeUpdate();
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	public boolean deletestud(int rno){
		query="delete from stud where rno=?";
		try {
			ps=conn.prepareStatement(query);
			ps.setInt(1, rno);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public List<stud> displaystud(){
		List<stud> list=new LinkedList<stud>();
		query="select * from stud";
		try {
			ps=conn.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				stud s=new stud();
				s.setRno(rs.getInt(1));
				s.setName(rs.getString(2));
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public void searchstud(int rno) {
		query="select * from stud where rno=?";
		ResultSet rs=null;
		stud s=new stud();
		try {
			ps=conn.prepareStatement(query);
			ps.setInt(1, rno);
			rs=ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(rs.next()) {
				
				s.setRno(rs.getInt(1));
				s.setName(rs.getString(2));
				System.out.println(s);
			}
			else {
				System.out.println("stud not available");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
