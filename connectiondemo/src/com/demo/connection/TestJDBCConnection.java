package com.demo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBCConnection {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.151:3306/dac40?useSSL=false";
			Connection con=DriverManager.getConnection(url,"dac40","welcome");
			if(con!=null) {
				System.out.println("Connection successful");
			}else {
				System.out.println("Connection failed");
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
