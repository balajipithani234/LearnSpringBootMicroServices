package com.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguides.springboot.entity.Account;
import com.javaguides.springboot.repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService
{
 @Autowired
 private AccountRepo repo;
	@Override
	public Account createAccount(Account account) 
	{
		Account account1=repo.save(account);
		return account1;
	}
	@Override
	public Account getAccountByAccountNumber(Long accountNo) 
	{
		Optional<Account>account=repo.findById(accountNo);
		if(account.isEmpty())
		{
		  throw new RuntimeException("account is not present");
		}
		Account account_found=account.get();
		return account_found;
	}
	@Override
	public List<Account> getAllAccountDetails() 
	{
		List<Account>account1=repo.findAll();
		return account1;
	}
	@Override
	public Account DepositAmountByAccountNo(Long accountNo, double amount) 
	{
		Optional<Account> account1=repo.findById(accountNo);
		 if(account1.isEmpty())
		 {
		   new RuntimeException("account is not present");
		 }
		 Account account_found=account1.get();
		 double total_Balance=account_found.getAccountBalance()+amount;
		 account_found.setAccountBalance(total_Balance);
		 repo.save(account_found);
		return account_found;
	}
}
