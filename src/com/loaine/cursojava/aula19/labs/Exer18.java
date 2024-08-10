package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for(int i = 0; i<idades.length; i++) {
			System.out.println("Entre com o valor da idade da " + (i+1) + "º pessoa:");
			idades[i] = scan.nextInt();
		}
		
		int menorIdade = idades[0];
		int indexMenor = 0;
		int maiorIdade = idades[0];
		int indexMaior = 0;
		
		for(int i = 1; i<idades.length; i++) {
			
			if(idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenor = i;
				
			}else if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaior = i;
			}
		}
		
		System.out.print("Vetor de idades = ");
		for(int i = 0; i<idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		
		System.out.println();
		System.out.println("A menor idade é " + menorIdade + " e a posição dela é: " + indexMenor + "º.");
		System.out.println("A maior idade é " + maiorIdade + " e a posição dela é: " + indexMaior + "º.");

	}
	

}
