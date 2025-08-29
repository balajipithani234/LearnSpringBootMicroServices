package com.javaguides.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javaguides.springboot.exception.dCoder.CustomDcoder;

import feign.codec.ErrorDecoder;

@Configuration
public class DcoderConfig 
{
 @Bean
 public ErrorDecoder createConfig()
 {
   return new CustomDcoder();
 }
}
