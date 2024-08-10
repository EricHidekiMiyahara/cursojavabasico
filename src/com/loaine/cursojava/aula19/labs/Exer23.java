package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + (i+1) + " do vetor A:");
			vetorA[i] = scan.nextInt();
			
				if(vetorA[i] % 2 != 0) {
					System.out.println("Programa encerrado.");
					break;
				}
				
		}
	}

}
