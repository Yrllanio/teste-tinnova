package com.tinnova.dto;

import java.io.Serializable;

public class VeiculosNaoVendidosDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long veiculosNaoVendidos;	
	
	public VeiculosNaoVendidosDTO() {
	}
	
	public VeiculosNaoVendidosDTO(Long veiculosNaoVendidos) {
		this.veiculosNaoVendidos = veiculosNaoVendidos;
	}

	public Long getVeiculosNaoVendidos() {
		return veiculosNaoVendidos;
	}

	public void setVeiculosNaoVendidos(Long veiculosNaoVendidos) {
		this.veiculosNaoVendidos = veiculosNaoVendidos;
	}
	
	
}
