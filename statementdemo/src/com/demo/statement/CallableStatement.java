package com.demo.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class CallableStatement {
		public static void main(String[] args) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.151:3306/dac40?useSSL=false";
				Connection con=DriverManager.getConnection(url,"dac40","welcome");
				if(con!=null)
				{
					System.out.println("Connection Successful");
				}
				else {
					System.out.println("Connection Failed");
				}
				
				java.sql.CallableStatement cs=con.prepareCall("{call getCnt(?,?)}");
				cs.setInt(1, 30);
				cs.registerOutParameter(2, Types.INTEGER);
				cs.execute();
				int c=cs.getInt(2);
				System.out.println("Count : "+c);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
