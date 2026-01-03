package com.demo.CategoryMicroWebService.service;

import com.demo.CategoryMicroWebService.beans.Category;
import com.demo.CategoryMicroWebService.dto.CategoryDto;

public interface CategoryService {

	Category getById(int cid);

	CategoryDto getProdCatById(int cid);

}
