package com.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AccountRepositoryImpl implements AccountRepository{

	private final Map<String,Double> accounts = new HashMap<>();
	
	@Override
	public void createAccount(String acholdername) {
		// TODO Auto-generated method stub
		accounts.put(acholdername, 0.0);
		System.out.println("Account created for "+acholdername);
	}

	@Override
	public double getBalance(String acholdername) {
		// TODO Auto-generated method stub
		
		
		return accounts.getOrDefault(acholdername, 0.0);
	}

	@Override
	public void updateBalance(String acholdername, double amount) {
		// TODO Auto-generated method stub
		accounts.put(acholdername, getBalance(acholdername)+amount);
		System.out.println("Account Updated "+acholdername+" with "
		+amount+" and current balance= "+getBalance(acholdername));
	}
	
}
