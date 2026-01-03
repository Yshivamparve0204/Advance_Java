package com.demo.dao;

import java.util.List;

import com.demo.model.Manufacture;

public interface ManufactureDao {

	List<Manufacture> showAllProduts();

	boolean newProduct(Manufacture m);

	Manufacture showProd(int id);

	boolean updateProd(Manufacture m);

	void closeMyConnection();

	boolean delprod(int id);

}
