package com.javaguides.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bankdetails")
public class Account 
{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long accountNo;
 @Column
 private String holderName;
 @Column
 private double accountBalance;
 @Column
 private String bankName;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(long accountNo, String holderName, double accountBalance, String bankName) {
	super();
	this.accountNo = accountNo;
	this.holderName = holderName;
	this.accountBalance = accountBalance;
	this.bankName = bankName;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", holderName=" + holderName + ", accountBalance=" + accountBalance
			+ ", bankName=" + bankName + "]";
}
 
 
}
