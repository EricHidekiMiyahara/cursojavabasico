package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i + "° do vetor A:");
			vetorA[i] = scan.nextInt();
			
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		int par = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			
			if(vetorA[i] % 2 == 0) {
				par++;
			}
		}
		
		int impar = vetorA.length - par;
		
		double porcImpar = (impar * 100) / vetorA.length;
		double porcPar = (par * 100) / vetorA.length;
		
		System.out.println("Porcentagem de números pares: " + porcPar + "%.");
		System.out.println("Porcentagem de números ímpares: " + porcImpar + "%.");

	}

}
