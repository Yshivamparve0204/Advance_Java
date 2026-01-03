package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao{
	
	static Connection conn;
	static PreparedStatement prodselect;
	static {
		conn=DBUtil.getMyconnection();
		try {
			prodselect=conn.prepareStatement("select * from product where catid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Product> getAllProduct(int c) {
		try {
			prodselect.setInt(1, c);
			List<Product> plist=new ArrayList<>();
			ResultSet rs=prodselect.executeQuery();
			while(rs.next()) {
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5));
				plist.add(p);
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Product> showAll(String[] parr) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<parr.length;i++) {
			stringBuilder.append("?,");
		}
		String placeholder=stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
		
		try {
			String sql = "select * from product where pid in (" + placeholder + ")";
			PreparedStatement ps=conn.prepareStatement(sql);
			List<Product> plist=new ArrayList<>();
			for(int i=1;i<=parr.length;i++) {
			ps.setInt(i, Integer.parseInt(parr[i-1]));
			}
			ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5));
			plist.add(p);
		}
		return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
