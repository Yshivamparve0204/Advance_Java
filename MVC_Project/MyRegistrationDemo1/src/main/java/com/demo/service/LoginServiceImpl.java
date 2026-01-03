package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao ldao;
	

	public MyUser validateUser(String uname, String passwd) {
		// TODO Auto-generated method stub
		return ldao.authenticateUser(uname,passwd);
	}


	@Override
	public void registerUser(MyRegisterUser user) {
		// TODO Auto-generated method stub
		ldao.registeruser(user);
	}

}
