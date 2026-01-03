package com.demo.SpringBootRestWebService.service;

import java.util.List;

import com.demo.SpringBootRestWebService.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllProducts();

	ProductDto getById(int pid);

	boolean addProduct(ProductDto p);

	boolean updateProduct(ProductDto p);

	boolean deleteById(int pid);

}
