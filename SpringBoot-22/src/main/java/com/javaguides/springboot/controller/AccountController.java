package com.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.springboot.entity.Account;
import com.javaguides.springboot.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController 
{
 @Autowired
 private AccountService service;
 @PostMapping("/create")
 //@ResponseStatus(code=HttpStatus.CREATED)
 public ResponseEntity<Account> createAccount(@RequestBody Account account)
 {
	Account account1=service.createAccount(account);
   return ResponseEntity.status(HttpStatus.CREATED).body(account1);	 
 }
 @GetMapping("/{accountNo}")
 public ResponseEntity<Account> getAccountDetailsByAccountNumber(@PathVariable Long accountNo)
 {
	Account account1=service.getAccountByAccountNumber(accountNo);
   return ResponseEntity.status(HttpStatus.ACCEPTED).body(account1);
 }
 @GetMapping("/getAllAccounts")
 public List<Account> getAllAccountDetails()
 {
	 List<Account>account=service.getAllAccountDetails();
	 return account;
 }
 @PutMapping("/Deposit/{accountNo}/{amount}")
 @ResponseStatus(code=HttpStatus.UPGRADE_REQUIRED)
 public Account DepositAmountByAccountNumber(@PathVariable Long accountNo,@PathVariable double amount)
 {
	Account account1=service.DepositAmountByAccountNo(accountNo, amount);
   return account1;
 }
}
