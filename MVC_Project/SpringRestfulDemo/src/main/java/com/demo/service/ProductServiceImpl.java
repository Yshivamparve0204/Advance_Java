package com.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dto.ProductDto;
import com.demo.mapper.ProductDtoMapper;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
ProductDao pdao;
	@Override
	public List<ProductDto> findAll() {
	List<Product>plist=pdao.findAll();
	List<ProductDto>list=plist.stream().map(prod->ProductDtoMapper.mapToProductDto(prod)).collect(Collectors.toList());
	
		
		return list;
	}

}
