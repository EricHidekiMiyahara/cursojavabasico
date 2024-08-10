package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i + "º do vetor A:");
			vetorA[i] = scan.nextInt();
		}
		
		int somaMenor15 = 0;
		int igual15 = 0;
		int somaMaior15 = 0;
		int qtd = 0;
		double media;
		
		for(int i = 0; i<vetorA.length; i++) {
			
			if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
				
			}else if (vetorA[i] == 15) {
				igual15++;
				
			}else {
				qtd++;
				somaMaior15 += vetorA[i];
			}
			
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Soma dos elementos menores do que 15: " + somaMenor15);
		
		System.out.println("Quantidade de elementos iguais a 15: " + igual15);

		System.out.println("Média: " + (somaMaior15 / qtd));
		
	}

}
