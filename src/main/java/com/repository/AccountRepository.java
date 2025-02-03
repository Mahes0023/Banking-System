package com.repository;


public interface AccountRepository {

	void createAccount(String acholdername);
	double getBalance(String acholdername);
	void updateBalance(String acholdername, double amount);
	
}
