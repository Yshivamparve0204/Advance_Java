package com.demo.service;

import java.util.List;

import com.demo.dao.ManufactureDao;
import com.demo.dao.ManufactureDaoImpl;
import com.demo.model.Manufacture;

public class ManufactureServiceImpl implements ManufactureService{
	
	private ManufactureDao mdao;
	public ManufactureServiceImpl() {
		mdao=new ManufactureDaoImpl();
	}
	@Override
	public List<Manufacture> getAllProducts() {
		
		return mdao.showAllProduts();
	}
	@Override
	public boolean addProduct(Manufacture m) {
		
		return mdao.newProduct(m);
	}
	@Override
	public Manufacture findProd(int id) {
		// TODO Auto-generated method stub
		return mdao.showProd(id);
	}
	@Override
	public boolean updateProduct(Manufacture m) {
		
		return mdao.updateProd(m);
	}
	@Override
	public void closeMyConnection() {
		mdao.closeMyConnection();
		
	}
	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return mdao.delprod(id);
	}
	
}
