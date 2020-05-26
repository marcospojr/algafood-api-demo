package com.marcosjr.algafooddemo.di.notification;

import com.marcosjr.algafooddemo.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar (Cliente cliente, String mensagem) {
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase(); 
		}
		
		System.out.printf("Notificando o cliente %s pelo email %s usando SMTP %s: %s\n ",
				cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
