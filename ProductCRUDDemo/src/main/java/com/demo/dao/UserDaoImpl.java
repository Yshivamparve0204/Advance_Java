package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.model.User;

public class UserDaoImpl implements UserDao{
	
		private static Connection conn;
		static PreparedStatement ps;
		static {
			conn=DBUtil.getMyConnection();
			try {
				ps=conn.prepareStatement("select * from user where email=? and password=?");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public User validateUser(String uname, String pass) {
			try {
				ps.setString(1, uname);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				User u=null;
				while(rs.next()) {
					u=new User(rs.getString(3),null,null,null,null,rs.getString(1),rs.getString(2));
				}
				return u;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}
}
