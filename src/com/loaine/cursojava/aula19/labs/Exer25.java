package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + (i+1) + " do vetor A:");
			vetorA[i] = scan.nextInt();
			// operador ternário
			// vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;

		}
		
		for (int i = 0; i<vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}else {
				vetorB[i] = 0;
			}
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for(int i = 0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
