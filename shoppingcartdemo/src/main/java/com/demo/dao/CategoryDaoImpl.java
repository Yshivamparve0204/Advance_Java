package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.demo.model.Category;

public class CategoryDaoImpl implements CategoryDao{

	static Connection conn;
	static PreparedStatement selcat;
	static {
		conn=DBUtil.getMyconnection();
		try {
			selcat=conn.prepareStatement("select * from categories");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Category> showAllCategories() {
		
		try {
			List<Category> clist=new ArrayList<>();
			ResultSet rs=selcat.executeQuery();
			while(rs.next()) {
				Category c=new Category(rs.getInt(1),rs.getString(2),rs.getString(3));
				clist.add(c);
			}
			return clist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
