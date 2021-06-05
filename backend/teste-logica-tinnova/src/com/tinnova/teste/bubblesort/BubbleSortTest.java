package com.tinnova.teste.bubblesort;

public class BubbleSortTest {

	public static void main(String[] args) {
		
		int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
		
		 int k = 0, j, aux, n = 8;

		    for (k = 1; k < n; k++) {
		        System.out.printf("\n[%d] ", k);

		        for (j = 0; j < n - k; j++) {
		        	System.out.printf("%d, ", j);

		            if (vetor[j] > vetor[j + 1]) {
		                aux          = vetor[j];
		                vetor[j]     = vetor[j + 1];
		                vetor[j + 1] = aux;
		            }
		        }
		    }
		}
}		
	


