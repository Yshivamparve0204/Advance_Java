package com.demo.ProductMicroWebService.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.ProductMicroWebService.beans.Product;
import com.demo.ProductMicroWebService.dto.Productdto;

public class ProductDtoMapper {

	public static Product mapToProduct(Productdto p) {
		return new Product(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),LocalDate.parse(p.getLdtstr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
	}
	public static Productdto mapToProductDto(Product prod) {
		if(prod.getMfgdate()!=null) {
			return new Productdto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),prod.getMfgdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),prod.getCid());
		}
		return new Productdto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),null,prod.getCid());
		
	}
}
