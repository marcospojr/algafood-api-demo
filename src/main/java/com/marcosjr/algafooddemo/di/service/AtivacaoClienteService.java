package com.marcosjr.algafooddemo.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.marcosjr.algafooddemo.di.modelo.Cliente;
import com.marcosjr.algafooddemo.di.notification.Notificador;

public class AtivacaoClienteService {
	
//	Ponto de injeção no atributo
	
	@Autowired
	private Notificador notificador;
	
//	Ponto de injeção no construtor (ideal)

	@Autowired
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
//	Exemplo de uso do @Autowired com mais de uma implementação de uma mesma classe
	
//	public AtivacaoClienteService(String qualquer) {
//		
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo! ");
	}

// 	Ponto de injeção com método setter
	
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
}
