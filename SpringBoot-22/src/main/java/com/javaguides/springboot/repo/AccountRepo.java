package com.javaguides.springboot.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long> 
{

}
