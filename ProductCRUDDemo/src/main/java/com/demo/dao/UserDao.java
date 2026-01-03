package com.demo.dao;

import com.demo.model.User;

public interface UserDao {

	User validateUser(String uname, String pass);
		
}
