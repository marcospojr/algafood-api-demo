package com.marcosjr.algafooddemo.di.notification;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME) 
public @interface TipoDoNotificador {

	NivelUrgencia value();
}
