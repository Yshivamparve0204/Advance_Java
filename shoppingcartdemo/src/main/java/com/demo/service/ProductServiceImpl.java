package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao pdao;
	public ProductServiceImpl() {
		pdao=new ProductDaoImpl();
	}
	@Override
	public List<Product> showAllProduct(int c) {
		
		return pdao.getAllProduct(c);
	}
	@Override
	public List<Product> findAllProduct(String[] parr) {
		return pdao.showAll(parr);
	}

}
