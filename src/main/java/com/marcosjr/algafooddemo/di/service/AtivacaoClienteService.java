package com.marcosjr.algafooddemo.di.service;

import com.marcosjr.algafooddemo.di.modelo.Cliente;
import com.marcosjr.algafooddemo.di.notification.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo! ");
	}
}
