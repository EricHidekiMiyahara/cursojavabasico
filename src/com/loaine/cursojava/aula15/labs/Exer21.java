package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o valor do saque? ");
		int saque = scan.nextInt();
		
		if (saque >= 10 && saque <= 600) {
			
			int umReal = saque / 1;
			int cincoReais = saque / 5;
			int dezReais = saque / 10;
			int cinquentaReais = saque / 50;
			int cemReais = saque / 100;
			
			System.out.println(cemReais + " notas de R$100 reais, " + cinquentaReais + " notas de R$50 reais, " + dezReais + " notas de R$10 reais, " + cincoReais + " notas de R$5 reais e " + umReal + " notas de R$1 real.");
		}
	}

}
