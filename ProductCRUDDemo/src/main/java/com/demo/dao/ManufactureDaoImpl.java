package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

import com.demo.model.Manufacture;

public class ManufactureDaoImpl implements ManufactureDao{
		
	private static Connection conn;
	static PreparedStatement ps,addprod,getprod,upprod,delprod;
	static {
		conn = DBUtil.getMyConnection();
		try {
			ps=conn.prepareStatement("select * from manufacturing");
			addprod=conn.prepareStatement("insert into manufacturing values(?,?,?,?,?,?,?)");
			getprod=conn.prepareStatement("select * from manufacturing where id=?");
			upprod=conn.prepareStatement("update manufacturing set product_name=?,quantity=?,production_date=?,factory_location=?,status=?,price=? where id=?");
		    delprod=conn.prepareStatement("delete from manufacturing where id=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Manufacture> showAllProduts() {
		try {
			ResultSet rs=ps.executeQuery();
			List<Manufacture> mlist=new ArrayList<>();
			Manufacture m=null;
			LocalDate ldt=null;
			while(rs.next()) {
				ldt=LocalDate.parse(rs.getString(4),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				m=new Manufacture(rs.getInt(1),rs.getString(2),rs.getInt(3),ldt,rs.getString(5),rs.getString(6),rs.getFloat(7));
				mlist.add(m);				
			}
			return mlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public boolean newProduct(Manufacture m) {
		try {
			addprod.setInt(1, m.getId());
			addprod.setString(2, m.getProduct_name());
			addprod.setInt(3, m.getQuantity());
			addprod.setDate(4, Date.valueOf(m.getProduction_date()));
			addprod.setString(5, m.getFactory_location());
			addprod.setString(6, m.getStatus());
			addprod.setFloat(7,m.getPrice());
			int n=addprod.executeUpdate();
		    return n>0;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public Manufacture showProd(int id) {
		try {
			getprod.setInt(1,id);
			ResultSet rs=getprod.executeQuery();
			LocalDate ldt=null;
			
			Manufacture m=null;
			if(rs.next()) {
				ldt=LocalDate.parse(rs.getString(4),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
               m=new Manufacture(rs.getInt(1),rs.getString(2),rs.getInt(3),ldt,rs.getString(5),rs.getString(6),rs.getFloat(7));
			}
			return m;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return null;
	}
	@Override
	public boolean updateProd(Manufacture m) {
		try {
			upprod.setString(1,m.getProduct_name());
			upprod.setInt(2, m.getQuantity());
			upprod.setDate(3, Date.valueOf(m.getProduction_date()));
			upprod.setString(4, m.getFactory_location());
			upprod.setString(5, m.getStatus());
			upprod.setFloat(6, m.getPrice());
			upprod.setInt(7, m.getId());
			int n=upprod.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void closeMyConnection() {
		DBUtil.closeMyConnection();
		
	}
	@Override
	public boolean delprod(int id) {
		try {
			delprod.setInt(1, id);
			int n=delprod.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
