package com.demo.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPreparedStatement {

	
	public static void main(String[] args) {
		try {
			 Scanner sc=new Scanner(System.in);
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.151:3306/dac40?useSSL=false";
			Connection con=DriverManager.getConnection(url,"dac40","welcome");
			if(con!=null)
			{
				System.out.println("Connection Successfull");
			}
			else {
				System.out.println("Connection Failed");
			}
			PreparedStatement ps=con.prepareStatement("Select * from dept where deptno=?");
			System.out.println("Enter dept no:");
			int n=sc.nextInt();
			ps.setInt(1, n);
			ResultSet rs=ps.executeQuery();
			if(rs!=null) {
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println("----------------------------------");
			}
			}else {
				System.out.println("Deptno not found");
			}
			con.close();
			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
