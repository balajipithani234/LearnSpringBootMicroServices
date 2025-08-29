package com.javaguides.springboot.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class OrderRequest 
{
 private Long productId;
 private int quantity;
 private Double amount;
 private PaymentMode paymentMode;
public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public PaymentMode getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(PaymentMode paymentMode) {
	this.paymentMode = paymentMode;
}
 
 
}
