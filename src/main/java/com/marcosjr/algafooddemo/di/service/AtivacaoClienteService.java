package com.marcosjr.algafooddemo.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.modelo.Cliente;
import com.marcosjr.algafooddemo.di.notification.NivelUrgencia;
import com.marcosjr.algafooddemo.di.notification.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
		
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
			
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
	}
}
