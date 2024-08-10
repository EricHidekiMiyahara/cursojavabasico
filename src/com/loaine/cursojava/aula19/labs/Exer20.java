package com.loaine.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacaoDolar;
	
		System.out.println("Qual é a cotação do dólar (U$) em relação ao real (R$)? ");
		cotacaoDolar = scan.nextDouble();
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = cotacaoDolar * (i+1);
		}
		
		DecimalFormat dc = new DecimalFormat("##,#.#");
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			
		}
		
	}

}
