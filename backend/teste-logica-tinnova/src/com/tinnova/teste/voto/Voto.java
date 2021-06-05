package com.tinnova.teste.voto;

public class Voto {

	private double totalDeEleitores;
	private double validos;
	private double votosBrancos;
	private double nulos;

	
	public Voto(int totalDeEleitores, int validos, int votosBrancos, int nulos) {		
		this.totalDeEleitores = totalDeEleitores;
		this.validos = validos;
		this.votosBrancos = votosBrancos;
		this.nulos = nulos;
	}

	public double porcentagemValidos() {
		return validos =  validos / totalDeEleitores;
	}

	public double porcentagemBrancos() {
		return votosBrancos = votosBrancos / totalDeEleitores;
	}
	
	public double porcentagemNulos() {
		return nulos = nulos / totalDeEleitores;
	}

}
