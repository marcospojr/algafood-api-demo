package com.marcosjr.algafooddemo.di.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.modelo.Cliente;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	
	public NotificadorEmail() {
		System.out.println("NofiticadorEmail REAL");
	}
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {

		System.out.printf("Notificando o cliente %s pelo email %s: %s\n ",
				cliente.getNome(), cliente.getEmail(), mensagem);
		
	}

}
