package com.marcosjr.algafooddemo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.notification.NivelUrgencia;
import com.marcosjr.algafooddemo.di.notification.Notificador;
import com.marcosjr.algafooddemo.di.notification.TipoDoNotificador;
import com.marcosjr.algafooddemo.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}

}
