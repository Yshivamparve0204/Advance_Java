package com.demo.CategoryMicroWebService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.demo.CategoryMicroWebService.beans.Category;
import com.demo.CategoryMicroWebService.dao.CategoryDao;
import com.demo.CategoryMicroWebService.dto.CategoryDto;
import com.demo.CategoryMicroWebService.dto.ProductDto;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao cdao;
	@Autowired
private RestClient restClient;
	@Override
	public Category getById(int cid) {
		// TODO Auto-generated method stub
		Optional<Category>op=cdao.findById(cid);
		if(op.isPresent())
		{
			return op.get();
		}
		return null;
	}
	@Override
	public CategoryDto getProdCatById(int cid) {
		// TODO Auto-generated method stub
		Category c=cdao.findById(cid).orElseThrow(()->new RuntimeException("categroy not found"));
		List<ProductDto>plist=restClient.get().uri("http://PRODUCT-SERVICE/product/category/"+cid)
				.retrieve().body(new ParameterizedTypeReference<List<ProductDto>>() {});
		CategoryDto cdto=new CategoryDto();
		cdto.setCategory(c);
		cdto.setPlist(plist);
		
		
		return cdto;
	}

}
