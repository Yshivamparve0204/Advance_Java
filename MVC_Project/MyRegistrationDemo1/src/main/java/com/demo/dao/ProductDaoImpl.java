package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Product> findAllProducts() {
		List<Product>plist=jdbcTemplate.query("select * from product1",(rs,numrows)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			if(rs.getDate(5)==null)
			{
				p.setMfgdate(null);
			}else {
			p.setMfgdate(rs.getDate(5).toLocalDate());
			}
			p.setCid(rs.getInt(6));
			return p;
		});
		
		return plist;
	}
	@Override
	public boolean save(Product p) {
		// TODO Auto-generated method stub
		int n=jdbcTemplate.update("insert into Product1 values(?,?,?,?,?,?)",
				new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate(),p.getCid()});
		return n>0;
	}
	@Override
	public boolean deleteById(int pid) {
	  int n = jdbcTemplate.update("delete from product1 where pid=?",new Object[]{pid}); 
		return n>0;
	}
	@Override
	public Product findById(int pid) {
		try {
		 Product p = jdbcTemplate.queryForObject("select * from product1 where pid=?",new Object[]{pid},BeanPropertyRowMapper.newInstance(Product.class)); 
			return p;
		}catch(EmptyResultDataAccessException e) {
		System.out.println(e.getMessage());
		return null;
		}
	
	}
	@Override
	public boolean modifyProduct(Product p) {
	 int n = jdbcTemplate.update("update product1 set pname=?,qty=?,price=? where pid=?",new Object[] {
			 p.getPname(),p.getQty(),p.getPrice(),p.getPid()
	 });
		return n>0;
	}

}
