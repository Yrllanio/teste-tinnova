package com.tinnova.teste.multiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {		
		
        int numero, soma = 0;
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Digite um n�mero: ");
        numero = teclado.nextInt();

        
        for(int i = numero-1; i >= 0; i--) {
            if(i % 5 == 0 | i % 3 == 0) {
                soma = soma + i;
            }
        }
       
        System.out.println("A Soma dos n�meros m�ltiplos de 3 ou 5 at� " + numero + " �: " + soma);          

        teclado.close();
	}
}

