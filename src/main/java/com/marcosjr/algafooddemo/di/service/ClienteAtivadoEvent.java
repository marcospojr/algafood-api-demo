package com.marcosjr.algafooddemo.di.service;

import com.marcosjr.algafooddemo.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

}
