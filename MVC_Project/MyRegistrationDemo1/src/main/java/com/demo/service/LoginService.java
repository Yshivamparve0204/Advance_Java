package com.demo.service;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String passwd);

	void registerUser(MyRegisterUser user);

}
