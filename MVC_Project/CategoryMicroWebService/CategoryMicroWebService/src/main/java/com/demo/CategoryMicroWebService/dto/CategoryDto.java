package com.demo.CategoryMicroWebService.dto;

import java.util.List;

import com.demo.CategoryMicroWebService.beans.Category;

public class CategoryDto {
Category category;
List<ProductDto>plist;
public CategoryDto() {
	super();
	// TODO Auto-generated constructor stub
}
public CategoryDto(Category category, List<ProductDto> plist) {
	super();
	this.category = category;
	this.plist = plist;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public List<ProductDto> getPlist() {
	return plist;
}
public void setPlist(List<ProductDto> plist) {
	this.plist = plist;
}
@Override
public String toString() {
	return "CatrgoryDto [category=" + category + ", plist=" + plist + "]";
}

}
