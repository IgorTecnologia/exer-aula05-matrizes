package com.igor.cursojava.aula05;

import java.util.Scanner;

public class Exer04Matrizes {

	public static void main(String[] args) {
	
		double matriz [][] = new double [10][4];
		double media [] = new double [10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
			System.out.println("Digite a nota da posição [" + i + "]" + "[" + j + "]");	
			matriz[i][j] = scan.nextDouble();
			
			}
		}
			
		for(int i =0; i<10; i++) {
			double soma =0;
			for(int j=0; j<4; j++) {
				soma += matriz[i][j];
			}
			media[i] = soma/4;
		}
		
		System.out.println("\nMédias dos participantes:");
		for(int i =0; i<10; i++) {
			System.out.printf("%s %.1f ", " | ", media[i]);
		}
	}

}
