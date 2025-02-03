package com.service;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email Notification "+message);
	}

}
