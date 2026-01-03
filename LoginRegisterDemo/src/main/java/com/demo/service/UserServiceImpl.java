package com.demo.service;

import com.demo.dao.UserDaoImpl;
import com.demo.model.MyUser;
import com.demo.dao.UserDao;
public class UserServiceImpl implements UserService{

	private UserDao udao;
	public UserServiceImpl() {
		udao=new UserDaoImpl();
	}
	@Override
	public void registerUser(MyUser u) {
		udao.registerUser(u);
		
	}
	@Override
	public MyUser findQuestion(String email) {
		return udao.findQue(email);
	}
	@Override
	public boolean validateData(String user, String pass) {
		
		return udao.authenticateUser(user,pass);
	}
	@Override
	public boolean modifyPassword(String email, String newpass,String cpass) {
		return udao.changePassword(email,newpass,cpass);
	}
}
