package com.tinnova.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="tb_veiculo")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String veiculo;
	
	@Column(columnDefinition = "VARCHAR(30) CHECK (marca IN ('Fiat', 'Ford', 'Chevrolet', 'Volkswagen', 'Renault'))")
	private String marca;
	private Integer ano;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private Boolean vendido;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant created;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updated;

	public Veiculo() {
	}

	public Veiculo(Long id, String veiculo, String marca, Integer ano, String descricao, Boolean vendido,
			Instant created, Instant updated) {
		
		this.id = id;
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
		this.created = created;
		this.updated = updated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getVendido() {
		return vendido;
	}

	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}

	public Instant getCreated() {
		return created;
	}

	public Instant getUpdated() {
		return updated;
	}
	
	@PrePersist
	public void prePersist() {
		created = Instant.now();
	}
	
	@PreUpdate
	public void preUpdate() {
		updated = Instant.now();
	}	

}
