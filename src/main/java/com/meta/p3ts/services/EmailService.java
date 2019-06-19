package com.meta.p3ts.services;

import org.springframework.mail.SimpleMailMessage;

import com.meta.p3ts.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
