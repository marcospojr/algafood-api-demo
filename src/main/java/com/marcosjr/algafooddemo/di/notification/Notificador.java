package com.marcosjr.algafooddemo.di.notification;

import com.marcosjr.algafooddemo.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}