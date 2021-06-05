package com.tinnova.teste.voto;

public class Testa {

	public static void main(String[] args) {

		Voto voto = new Voto(1000, 800, 150, 50);

		System.out.println("Votos válidos: " + voto.porcentagemValidos() + "%");
		System.out.println("Votos brancos: " + voto.porcentagemBrancos() + "%");
		System.out.println("Votos nulos: " + voto.porcentagemNulos() + "%");
	}

}
