package com.marcosjr.algafooddemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcosjr.algafooddemo.di.modelo.Cliente;
import com.marcosjr.algafooddemo.di.service.AtivacaoClienteService;

@Controller
public class PrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public PrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	} 

	@GetMapping("/hello")
	@ResponseBody
	public String Hello() {
		Cliente joao = new Cliente("João", "joao@email.com", "34999999999");
		
		ativacaoClienteService.ativar(joao);
	
		return "Hello!";
	}

}
