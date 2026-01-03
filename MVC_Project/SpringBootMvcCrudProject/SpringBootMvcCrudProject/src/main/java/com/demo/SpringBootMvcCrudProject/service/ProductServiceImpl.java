package com.demo.SpringBootMvcCrudProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootMvcCrudProject.beans.Product;
import com.demo.SpringBootMvcCrudProject.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
private ProductDao pdao;
	@Override
	public List<Product> findAllProduct() {
		
		return pdao.findAll();
	}

}
