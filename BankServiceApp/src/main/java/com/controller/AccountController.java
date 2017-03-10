package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AccountDAO;
import com.pojo.Account;
import com.pojo.User;
import com.services.AccountService;

@RestController
@RequestMapping("/acc/")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AccountDAO accountDAO;
	
	@RequestMapping(value = "getAccList", method = RequestMethod.GET)
	public List<Account> getAccountList(){
		return accountService.findAll();
	}
	
	@RequestMapping(value = "saveAccInfo", method = RequestMethod.POST)
	public void saveAccInfoByuser(){
		
		User user =new User();
		user.setName("Nikhil");
		Account savingAcc =new Account();
//		Account LoanAcc =new Account();
		savingAcc.setAccSumm("asd");
		savingAcc.setAccTypName("Saving");
		savingAcc.setTransList("dfgfg");
		savingAcc.setUser(user);
//		
//		LoanAcc.setAccSumm("dfgdfg");
//		LoanAcc.setAccTypName("Loan");
//		LoanAcc.setTransList("dfgdfgwe");
//		LoanAcc.setUser(user);
		accountDAO.saveAccountInfo(savingAcc);
	}
}
