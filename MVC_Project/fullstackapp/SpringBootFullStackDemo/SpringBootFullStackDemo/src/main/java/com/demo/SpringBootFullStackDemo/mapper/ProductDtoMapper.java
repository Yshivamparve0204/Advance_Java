package com.demo.SpringBootFullStackDemo.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.SpringBootFullStackDemo.beans.Product;
import com.demo.SpringBootFullStackDemo.dto.ProductDto;

public class ProductDtoMapper {
	public static Product MapToProduct(ProductDto p)
	{
		return new Product(p.getCid(),p.getPname(),p.getQty(),p.getPrice(),LocalDate.parse(p.getLdtstr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
	}
	
	public static ProductDto mapToProductDto(Product prod) {
		if(prod.getMfgdate()==null) {
			return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),null,prod.getCid());
		}
		return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),prod.getMfgdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),prod.getCid());
		
	}

}
