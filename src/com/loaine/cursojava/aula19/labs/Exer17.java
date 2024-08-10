package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int maior35Anos = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com as idades da posição " + i + "º do vetor de idades:");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] > 35) {
				maior35Anos++;
			}
		}
		
		System.out.print("Vetor de idades = ");
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Quantidade de pessoas com mais de 35 anos: " + maior35Anos);
		
	}

}
