package com.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.repository.AccountRepository;
//import com.repository.AccountRepositoryImpl;
//import com.repository.TransactionRepository;
//import com.repository.TransactionRepositoryImpl;
//import com.service.BankService;
//import com.service.EmailNotificationService;
//import com.service.NotificationService;

@Configuration
@ComponentScan(basePackages = {"com.service","com.repository"})
public class AppConfig {

//	@Bean
//	public AccountRepository getAccountRepository()
//	{
//		return new AccountRepositoryImpl();
//	}
//	
//	@Bean
//	public TransactionRepository getTransactionRepository()
//	{
//		return new TransactionRepositoryImpl();
//	}
//	
//	@Bean
//	public NotificationService getNotificationService()
//	{
//		return new EmailNotificationService();
//	}
//	
//	@Bean
//	public BankService getBankService()
//	{
//		return new BankService(getAccountRepository(), getTransactionRepository(), getNotificationService());
//	}
	
}
