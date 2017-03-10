package com.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pojo.Account;


public interface AccountService extends JpaRepository<Account,Long>{
	
	

}
