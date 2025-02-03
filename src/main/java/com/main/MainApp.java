package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;
import com.service.BankService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		BankService bk = ctx.getBean(BankService.class);
		bk.createAccount("Mahes Kumar");
		bk.deposite("Mahes Kumar", 1000);
		bk.deposite("Mahes Kumar", 500);

	}

}
