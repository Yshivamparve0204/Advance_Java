package com.demo.SpringBootDemo.service;

import java.util.List;

import com.demo.SpringBootDemo.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllProducts();

	ProductDto getById(int pid);

	List<ProductDto> getByPrice(double lprice, double hprice);

	boolean addProduct(ProductDto p);

	boolean deleteById(int pid);

	boolean updateProduct(ProductDto p);

}
