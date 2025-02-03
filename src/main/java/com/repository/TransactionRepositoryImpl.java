package com.repository;

import org.springframework.stereotype.Component;

@Component
public class TransactionRepositoryImpl implements TransactionRepository{

	@Override
	public void recordTransactionRepository(String acholdername, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Transaction recorded for "+acholdername+" : "+amount);
	}

}
