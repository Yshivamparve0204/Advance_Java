package com.demo.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCConnection {

	public static void main(String[] args) {
    
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.151:3306/dac40?useSSL=false";
			Connection con=DriverManager.getConnection(url,"dac40","welcome");
			if(con!=null) {
				System.out.println("Connection done");
			}else {
				System.out.println("Connection failed");
			}
			Statement st=con.createStatement();
//			ResultSet rs=st.executeQuery("Select deptno,dname from dept");
			ResultSet rs1=st.executeQuery("Select * from dept where deptno=10");
			while(rs1.next()) {
				System.out.println(rs1.getInt(1));
				System.out.println(rs1.getString(2));
				System.out.println(rs1.getString(3));
				System.out.println(rs1.getString(4));
				System.out.println(rs1.getString(5));
				System.out.println("----------------------------------");
			}
//			int n=st.executeUpdate("insert into dept values(  120,'ACCOUNTING','NEW YORK','r50mpm','24/03/1989')");
//			if(n>0) {
//				System.out.println("Inserted succesfully");
//			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
