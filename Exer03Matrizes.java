package com.igor.cursojava.aula05;

import java.util.Scanner;

public class Exer03Matrizes {

	public static void main(String[] args) {
		
		int matrizes [] [] = new int [3] [3];
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int i=0; i<matrizes.length; i++) {
			for(int j=0; j<matrizes[i].length; j++) {
				
				System.out.println("Digite um valor para a posição [" + i + "][" + j + "]:");
				matrizes [i][j] = scan.nextInt();
			}
		}
		int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        
        // Encontrar os elementos e calcular as somas das diagonais
        for (int i = 0; i < 3; i++) {
            // Diagonal Principal
            somaDiagonalPrincipal += matrizes[i][i];
            
            // Diagonal Secundária
            somaDiagonalSecundaria += matrizes[i][2 - i];
        }
        
        // Imprimir os elementos das diagonais
        System.out.println("\nElementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrizes[i][i] + " ");
        }
        
        System.out.println("\nElementos da diagonal secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrizes[i][2 - i] + " ");
        }
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
	}

}
