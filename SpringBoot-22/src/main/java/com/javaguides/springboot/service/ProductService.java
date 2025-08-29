package com.javaguides.springboot.service;

import com.javaguides.springboot.exception.ProductServiceException;
import com.javaguides.springboot.model.ProductRequest;
import com.javaguides.springboot.model.ProductResponse;

public interface ProductService 
{
 public Long addProduct(ProductRequest productReq);

 public ProductResponse getProductById(Long productId) throws ProductServiceException;

public void reduceQuantity(Long productId, int quantity) throws ProductServiceException;
}
