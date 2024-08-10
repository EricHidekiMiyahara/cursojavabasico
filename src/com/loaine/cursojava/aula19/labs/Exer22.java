package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		double qtd0 = 0;
		double qtd1 = 0;
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random()* 1);
			System.out.print(vetorA[i] + " ");
			
			if(vetorA[i] == 0) {
				qtd0++;
			}else if(vetorA[i] == 1) {
				qtd1++;
			}
		}
		
		System.out.println();
		// 10 - 100%
		// qtd - x
		// x = (qtd * 100) / 10
		
		double porc0 = (qtd0 * 100) / vetorA.length;
		double porc1 = (qtd1 * 100) / vetorA.length;
		
		System.out.println("Porcentagem de 0's: " + porc0 + "%.");
		System.out.println("Porcentagem de 1's: " + porc1 + "%.");
		
	}

}
