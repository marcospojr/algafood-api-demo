package com.marcosjr.algafooddemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.marcosjr.algafooddemo.di.notification.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");	
		notificador.setCaixaAlta(true);
			
		return notificador;
	}
}
