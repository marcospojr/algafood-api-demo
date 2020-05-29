package com.marcosjr.algafooddemo.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.modelo.Cliente;
import com.marcosjr.algafooddemo.di.notification.Notificador;

@Component
public class AtivacaoClienteService {
		
	@Qualifier("email")
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
			
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo! ");

		}
}
