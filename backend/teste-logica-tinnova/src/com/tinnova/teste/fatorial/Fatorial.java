package com.tinnova.teste.fatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro para calcular o fatorial: ");
		int n = sc.nextInt();

		int fat = 1;

		for (int i = 2; i <= n; i++) {
			fat = fat * i;
		}

		System.out.println("O fatorial de " + n + " é igual a " + fat);

		sc.close();

	}

}
