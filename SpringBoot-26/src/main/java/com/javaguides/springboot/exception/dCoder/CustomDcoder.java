package com.javaguides.springboot.exception.dCoder;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaguides.springboot.exception.ErrorResponse;
import com.javaguides.springboot.exception.orderServiceCustomException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomDcoder implements ErrorDecoder
{

	@Override
	public Exception decode(String methodKey, Response response) 
	{
		ObjectMapper objectMapper=new ObjectMapper();
		try 
		{
			ErrorResponse errorResponse=objectMapper.readValue(response.body().asInputStream(), ErrorResponse.class);
			return new orderServiceCustomException(errorResponse.getMessage(),errorResponse.getErrorCode());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new orderServiceCustomException("serviceInternalException","SERVICE_EXCEPTION");
	   
	}

}
