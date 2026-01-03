package com.demo.SpringBootFullStackDemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootFullStackDemo.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{
    
	List<Product> findAll();

}
