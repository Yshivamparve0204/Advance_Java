package com.demo.ProductMicroWebService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ProductMicroWebService.beans.Product;
import com.demo.ProductMicroWebService.dao.ProductDao;
import com.demo.ProductMicroWebService.dto.Productdto;
import com.demo.ProductMicroWebService.mapper.ProductDtoMapper;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao pdao;

	@Override
	public List<Productdto> getAllProducts(int cid) {
	List<Product>plist = pdao.findAllByCid(cid);
	List<Productdto>plist1 = plist.stream().map(prod->ProductDtoMapper.mapToProductDto(prod)).collect(Collectors.toList());
		return plist1;
	}

}
