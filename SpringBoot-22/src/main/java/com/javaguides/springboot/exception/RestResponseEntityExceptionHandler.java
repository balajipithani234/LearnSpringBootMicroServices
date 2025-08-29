package com.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.javaguides.springboot.model.ErrorResponse;
import com.javaguides.springboot.service.ProductService;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler
{
  @ExceptionHandler(ProductServiceException.class)
  public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceException exception)
  {
	ErrorResponse response=new ErrorResponse();
	              response.setMessage(exception.getMessage());
	              response.setErrorCode(exception.getErrorCode());
	      return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
  }
}
