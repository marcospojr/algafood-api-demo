package com.marcosjr.algafooddemo.di.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.modelo.Cliente;

@Qualifier("email")
@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;

	@Override
	public void notificar (Cliente cliente, String mensagem) {
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase(); 
		}
		
		System.out.printf("Notificando o cliente %s pelo email %s: %s\n ",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
