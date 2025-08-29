package com.javaguides.springboot.exception;

import lombok.Data;

@Data
public class ProductServiceException extends Exception
{
 private String errorCode;
 public ProductServiceException(String message,String errorCode)
 {
	super(message);
	this.errorCode=errorCode;
 }
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}
 
}
