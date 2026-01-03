package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.model.MyUser;

public class UserDaoImpl implements UserDao{

	static Connection conn;
	 static PreparedStatement psuser,selQue,selUser,changepass;
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			psuser=conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			selUser=conn.prepareStatement("select email,password from user where email=? and password=?");
			changepass=conn.prepareStatement("update user set password=? where email=?");
			selQue=conn.prepareStatement("select * from user where email=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void registerUser(MyUser u) {
		try {
			psuser.setString(1, u.getName());
			psuser.setString(2, u.getGender());
			psuser.setString(3, String.join(",", u.getSkill()));
			psuser.setString(4, u.getQue());
			psuser.setString(5, u.getAns());
			psuser.setString(6,u.getEmail());
			psuser.setString(7, u.getPassword());
			int n=psuser.executeUpdate();
			if(n>0)
			{
				System.out.println("User Added");
			}
			else {
				System.out.println("Duplicate User");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public MyUser findQue(String email) {
		try {
			selQue.setString(1, email);
			ResultSet rs=selQue.executeQuery();
			if(rs.next())
			{
				MyUser u=new MyUser(rs.getString(4),rs.getString(5),rs.getString(6));
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean authenticateUser(String user, String pass) {
		try {
			selUser.setString(1, user);
			selUser.setString(2, pass);
			ResultSet rs=selUser.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(user) && rs.getString(2).equals(pass));
				{
					return true;
				}
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public boolean changePassword(String email, String newpass,String cpass) {
		try {
			if(cpass.equals(newpass)) {
			changepass.setString(1, newpass);
			changepass.setString(2, email);
			int n=changepass.executeUpdate();
			return n>0;
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
}
