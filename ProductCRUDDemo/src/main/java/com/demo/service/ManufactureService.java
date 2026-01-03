package com.demo.service;

import java.util.List;

import com.demo.model.Manufacture;

public interface ManufactureService {

	List<Manufacture> getAllProducts();

	boolean addProduct(Manufacture m);

	Manufacture findProd(int id);


	boolean updateProduct(Manufacture m);

	void closeMyConnection();

	boolean deleteProduct(int id);

}
