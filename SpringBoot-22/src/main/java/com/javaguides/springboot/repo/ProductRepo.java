package com.javaguides.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguides.springboot.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
