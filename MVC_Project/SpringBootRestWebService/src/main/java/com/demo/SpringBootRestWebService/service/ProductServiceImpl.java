package com.demo.SpringBootRestWebService.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRestWebService.beans.Product;
import com.demo.SpringBootRestWebService.dao.ProductDao;
import com.demo.SpringBootRestWebService.dto.ProductDto;
import com.demo.SpringBootRestWebService.mapper.ProductDtoMapper;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
ProductDao pdao;

	@Override
	public List<ProductDto> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product>plist=pdao.findAll();
		List<ProductDto>plist1=plist.stream().map(prod->ProductDtoMapper.mapToProductDto(prod)).collect(Collectors.toList());				
		return plist1;
	}

	@Override
	public ProductDto getById(int pid) {
		Optional<Product>p = pdao.findById(pid);
		if(p.isPresent()) {
			ProductDto prod = ProductDtoMapper.mapToProductDto(p.get());
			return prod;
		}
		return null;
	}

	@Override
	public boolean addProduct(ProductDto p) {
	Product prod = ProductDtoMapper.mapToProduct(p);
	Product p1 = pdao.save(prod);
	
		return p1!=null;
	}

	@Override
	public boolean updateProduct(ProductDto p) {
		Product prod = ProductDtoMapper.mapToProduct(p);
		Optional<Product>op = pdao.findById(prod.getPid());
		if(op.isPresent()) {
			Product p2 = op.get();
			p2.setPname(p.getPname());
			p2.setQty(p.getQty());
			p2.setPrice(p.getPrice());
			pdao.save(p2);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteById(int pid) {
	  Optional<Product>op = pdao.findById(pid);
	  if(op.isPresent()) {
		  pdao.delete(op.get());
		  return true;
	  }
	  
		return false;
	}
	
	
}
