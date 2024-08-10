package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int cont = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da " + i + "º posição do vetor A:");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				cont++;
			}
			
		}
		System.out.println("A quantidade de elementos pares do vetor A é: " + cont);
		
	}

}
