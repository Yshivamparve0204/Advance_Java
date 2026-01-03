package com.demo.SpringBootMvcCrudProject.service;

import java.util.List;

import com.demo.SpringBootMvcCrudProject.beans.Product;

public interface ProductService {

	List<Product> findAllProduct();

}
