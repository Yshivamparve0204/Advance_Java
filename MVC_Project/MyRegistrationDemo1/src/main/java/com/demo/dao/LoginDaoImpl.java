package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
   
	public MyUser authenticateUser(String uname, String passwd) {
		try {
	MyUser u1 = jdbcTemplate.queryForObject("select * from user where uname =? and pass=?",new Object[] {uname, passwd},
			BeanPropertyRowMapper.newInstance(MyUser.class));
		System.out.println(u1);
		return u1;
		}catch(EmptyResultDataAccessException e) {
			System.out.println("user not found");
			return null;
		}
	}

	@Override
	public void registeruser(MyRegisterUser user) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO registeruser (user_id, name, gender, dob, username, password, skills, photo_path) VALUES (?,?,?,?,?,?,?,?)"; 
		jdbcTemplate.update(sql, 
				new Object[] {user.getUserid(), user.getName(), user.getGender(), java.sql.Date.valueOf(user.getDob()), user.getUsername(), user.getPassword(), user.getSkills(), user.getPhotopath()});

	}

}
