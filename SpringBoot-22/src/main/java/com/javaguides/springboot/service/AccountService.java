package com.javaguides.springboot.service;

import java.util.List;

import com.javaguides.springboot.entity.Account;

public interface AccountService 
{
 public Account createAccount(Account account);	
 public Account getAccountByAccountNumber(Long accountNo);
 public List<Account> getAllAccountDetails();
 public Account DepositAmountByAccountNo(Long accountNo,double amount);
}
