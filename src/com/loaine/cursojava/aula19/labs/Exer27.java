package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com os valores da posição " + (i+1) + " do vetor A:");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}else {
				vetorB[i] = 'e';
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
