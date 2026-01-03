package com.demo.SpringBootMvcCrudProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootMvcCrudProject.beans.Product;
@Repository

public interface ProductDao extends JpaRepository<Product,Integer> {

}
