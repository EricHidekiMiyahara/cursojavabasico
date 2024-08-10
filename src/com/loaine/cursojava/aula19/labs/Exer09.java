package com.loaine.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		float[] vetorB = new float[vetorA.length];
		float[] vetorC = new float[vetorB.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da " + i + "º posição do vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i<vetorB.length; i++) {
			System.out.println("Entre com o valor da " + i + "º posição do vetor B: ");
			vetorB[i] = scan.nextFloat();
		}
		
		for(int i = 0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for(int i = 0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();

		System.out.print("Vetor C = ");
		
		for(int i = 0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}

}
