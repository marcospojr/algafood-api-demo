package com.marcosjr.algafooddemo.di.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.modelo.Cliente;

@Primary // pioriza este bean em caso de ambiguidade
@Qualifier("sms")
@Component
public class NotificadorSMS implements Notificador {
	
	private boolean caixaAlta;

	@Override
	public void notificar (Cliente cliente, String mensagem) {
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase(); 
		}
		
		System.out.printf("Notificando o cliente %s por SMS através do telefone %s: %s\n ",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
