package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.User;

public class UserServiceImpl implements UserService{

	private UserDao udao;
	public UserServiceImpl() {
		udao=new UserDaoImpl();
	}
	@Override
	public User validateUser(String uname, String pass) {
		
		return udao.validateUser(uname,pass);
	}
}
