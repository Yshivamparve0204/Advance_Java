package com.demo.dao;

import com.demo.model.MyUser;

public interface UserDao {

	void registerUser(MyUser u);

	MyUser findQue(String email);

	boolean authenticateUser(String user, String pass);

	boolean changePassword(String email, String newpass,String cpass);

}
