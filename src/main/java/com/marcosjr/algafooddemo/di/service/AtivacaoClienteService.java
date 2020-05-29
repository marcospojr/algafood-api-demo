package com.marcosjr.algafooddemo.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.modelo.Cliente;
import com.marcosjr.algafooddemo.di.notification.Notificador;

@Component
public class AtivacaoClienteService {
		
	@Autowired
	private List<Notificador> notificadores;
	


	public void ativar(Cliente cliente) {
		cliente.ativar();
			
		for(Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo! ");

		}
	}
}
