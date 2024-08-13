package com.loaine.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		
		int[][] numAleatorios = new int [10][10];
		
		Random numRandom = new Random();
		
		for(int i = 0; i<numAleatorios.length; i++) {
			for(int j = 0; j<numAleatorios[i].length; j++) {
				numAleatorios[i][j] = numRandom.nextInt(100);
			}
		}
		
		int maior = 0;
		int menor = 101;
		int linha5 = 5;
		
		for(int i = 0; i<numAleatorios[linha5].length; i++) {
			if(numAleatorios[linha5][i] > maior) {
				maior = numAleatorios[linha5][i];
				
			}if(numAleatorios[linha5][i] < menor) {
				menor = numAleatorios[linha5][i];
			}
		}
		
		int maiorC7 = 0;
		int menorC7 = 101;
		int coluna7 = 7;

		for(int i = 0; i<numAleatorios.length; i++) {
			if(numAleatorios[i][coluna7] > maiorC7) {
				maiorC7 = numAleatorios[i][coluna7];
			}if(numAleatorios[i][coluna7] < menorC7) {
				menorC7 = numAleatorios[i][coluna7];
			}
		}
		
		
		System.out.println("Matriz 10x10:");
		
		for(int i = 0; i<numAleatorios.length; i++) {
			for(int j = 0; j<numAleatorios[i].length; j++) {
				System.out.print(numAleatorios[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Maior valor da linha 5: " + maior);
		System.out.println("Menor valor da linha 5: " + menor);

		System.out.println("Maior valor da coluna 7: " + maiorC7);
		System.out.println("Menor valor da coluna 7: " + menorC7);
		
	}
}
