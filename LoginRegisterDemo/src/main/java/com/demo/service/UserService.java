package com.demo.service;

import com.demo.model.MyUser;

public interface UserService {

	void registerUser(MyUser u);

	MyUser findQuestion(String email);

	boolean validateData(String user, String pass);

	boolean modifyPassword(String email, String newpass,String cpass);

}
