package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
			
		for(int i = 0; i<vetorA.length; i++) {
				
			System.out.println("Entre com o valor da posição A - ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i<vetorA.length; i++) {
			
			System.out.println("Tabuada de " + vetorA[i]);
			System.out.println();
			
			for(int j = 1; j<=10; j++) {
				System.out.println(j + " X " + vetorA[i] + " = " + (j * vetorA[i]));
			}
			
			System.out.println();
		}
			
	}

}
