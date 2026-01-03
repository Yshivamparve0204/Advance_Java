package com.demo.ProductMicroWebService.service;

import java.util.List;

import com.demo.ProductMicroWebService.dto.Productdto;

public interface ProductService {

	List<Productdto> getAllProducts(int cid);

}
