package com.demo.SpringBootRestWebService.service;

import com.demo.SpringBootRestWebService.beans.MyUser;

public interface LoginService {
	MyUser validateUser(String uname, String passwd);
}
