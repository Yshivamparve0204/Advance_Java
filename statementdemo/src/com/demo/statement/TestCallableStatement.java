package com.demo.statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class TestCallableStatement {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.151:3306/dac40?useSSL=false";
			Connection con=DriverManager.getConnection(url,"dac40","welcome");
			if(con!=null) {
				System.out.println("connection successful");
			}
			else {
				System.out.println("connection failed");
			}
			CallableStatement cs=con.prepareCall("{call getcnt(?,?)}");
			System.out.println("Enter deptno:");
			int n=sc.nextInt();
			cs.setInt(1, n);
			cs.registerOutParameter(2, Types.INTEGER);
			cs.execute();
			int c=cs.getInt(2);
			System.out.println("Count : "+c);
			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
