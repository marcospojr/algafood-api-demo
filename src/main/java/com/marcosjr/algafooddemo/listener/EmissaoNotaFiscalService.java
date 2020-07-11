package com.marcosjr.algafooddemo.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.marcosjr.algafooddemo.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emittindo nota fiscal para cliente " + event.getCliente().getNome());
	}
}
