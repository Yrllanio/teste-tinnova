package com.tinnova.dto;

import java.io.Serializable;

public class VeiculoPorMarcaDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String marca;
	private Long quantidade;

	public VeiculoPorMarcaDTO() {
	}

	public VeiculoPorMarcaDTO(String marca, Long quantidade) {
		this.marca = marca;
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	
}
