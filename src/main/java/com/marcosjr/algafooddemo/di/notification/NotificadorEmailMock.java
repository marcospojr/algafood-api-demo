package com.marcosjr.algafooddemo.di.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {
	
	public NotificadorEmailMock() {
		System.out.println("Notificador MOCK");
	}
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {

		System.out.printf("MOCK: Notificação seria enviada para o cliente %s pelo email %s: %s\n ",
				cliente.getNome(), cliente.getEmail(), mensagem);
		
	}
}
