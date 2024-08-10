package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de CDs:");
		int qtdCDs = scan.nextInt();
		
		double soma = 0;
		double valor;
		
		for(int i = 1; i <= qtdCDs; i++) {
			System.out.println("Entre com o valor gasto do " + i + "º CD:");
			valor = scan.nextDouble();
			
			soma += valor;
		}
		
		double media = soma / qtdCDs;
		
		System.out.println("O valor total gasto é de R$: " + soma + " reais.");
		System.out.println("A média é de R$: " + media + " reais.");
	}

}
