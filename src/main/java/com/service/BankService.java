package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.repository.AccountRepository;
import com.repository.TransactionRepository;

@Component
public class BankService {
	
	private AccountRepository accountRepository;
	private TransactionRepository transactionRepository;
	private NotificationService notificationService;
	

	@Autowired
	public BankService(AccountRepository accountRepository, TransactionRepository transactionRepository,
			NotificationService notificationService) {
		super();
		this.accountRepository = accountRepository;
		this.transactionRepository = transactionRepository;
		this.notificationService = notificationService;
	}
	
	public void createAccount(String acholdername)
	{
		accountRepository.createAccount(acholdername);
	}
	
	public void deposite(String acholdername, double amount)
	{
		accountRepository.updateBalance(acholdername, amount);
		transactionRepository.recordTransactionRepository(acholdername, amount);
		notificationService.sendNotification("Deposite of "+amount+" to "+acholdername);
	}
	
}
