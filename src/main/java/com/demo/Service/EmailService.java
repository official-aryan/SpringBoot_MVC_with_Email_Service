package com.demo.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	JavaMailSender jm;
	// constructor injection 
	
	EmailService(JavaMailSender jm){
		
		this.jm=jm;
		
	}
	public void sendEmail(String to, String subject, String text) {
	
		
		
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(to);
		sm.setSubject(subject);
		sm.setText(text);
		
		jm.send(sm);
		
		
	}
	
}
