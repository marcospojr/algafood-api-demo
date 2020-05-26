package com.marcosjr.algafooddemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.marcosjr.algafooddemo.di.notification.NotificadorEmail;
import com.marcosjr.algafooddemo.di.service.AtivacaoClienteService;

// Classe instanciando os beans da NotificadorEmail e AtivacaoClienteService juntos
// @Configuration comentado para não interferir no funcionamento, esta classe substitui as
// classes NotificacaoConfig e ServiceConfig

//@Configuration
public class AlgaConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");	
		notificador.setCaixaAlta(true);
			
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
	
}
