package com.tinnova.dto;

import java.io.Serializable;

public class VeiculoPorDecadaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer decada;
	private Long quantidade;

	public VeiculoPorDecadaDTO() {
	}

	public VeiculoPorDecadaDTO(Integer decada, Long quantidade) {
		this.decada = decada;
		this.quantidade = quantidade;
	}

	public Integer getDecada() {
		return decada;
	}

	public void setDecada(Integer decada) {
		this.decada = decada;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

}
