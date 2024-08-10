package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o número da posição " + (i+1) + " do vetor A:");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println();
		
		// 1221
		
		boolean palindromo = true;
		for (int i = 0; i<(vetorA.length / 2); i++) {
			
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		if(palindromo) {
			System.out.println("É palíndromo.");
		}else {
			System.out.println("Não é palíndromo.");
		}
	}
}
