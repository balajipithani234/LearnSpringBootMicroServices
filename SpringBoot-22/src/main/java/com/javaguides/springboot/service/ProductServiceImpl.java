package com.javaguides.springboot.service;

import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguides.springboot.entity.Product;
import com.javaguides.springboot.exception.ProductServiceException;
import com.javaguides.springboot.model.ProductRequest;
import com.javaguides.springboot.model.ProductResponse;
import com.javaguides.springboot.repo.ProductRepo;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Service
@RequiredArgsConstructor
@Log4j2
public class ProductServiceImpl implements ProductService
{
 private static final org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger(ProductService.class);
	@Autowired
   private ProductRepo repo;
	
	@Override
	public Long addProduct(ProductRequest productReq) 
	{
		Product product=new Product();
		 product.setProductName(productReq.getProductName());
		 product.setPrice(productReq.getPrice());
		 product.setQuantity(productReq.getQuantity());
		 
		 Product product_save=repo.save(product);
		return product_save.getProductId(); 
	}

	@Override
	public ProductResponse getProductById(Long productId) throws ProductServiceException
	{
		Product product=repo.findById(productId)
				 .orElseThrow(()-> new ProductServiceException("Product id Not presented","Product_not_found"));
		   ProductResponse prs=new ProductResponse();
		   prs.setProductName(product.getProductName());
		   prs.setPrice(product.getPrice());
		   prs.setQuantity(product.getQuantity());
		return prs;
	}

	@Override
	public void reduceQuantity(Long productId, int quantity) throws ProductServiceException 
	{
		log.info("reduceing quantity intiated");
		Product product=repo.findById(productId)
				 .orElseThrow(()-> new ProductServiceException("Product id Not presented","Product_not_found"));	
	    if(product instanceof Product)
	    {
	      log.info("checking product quantity");
	      if(product.getQuantity() < quantity)
	      {
	    	 throw new ProductServiceException("Not to Enough quantity of product","NOT_ENOUGH_QUANTITY");
	      }
	      product.setQuantity(product.getQuantity() - quantity);
	      repo.save(product);
	      log.info("Product saved in DB");
	    }
	}

}
