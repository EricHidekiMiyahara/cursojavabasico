package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preço do primeiro produto: R$");
		double primProd = scan.nextDouble();
		
		System.out.println("Entre com o preço do segundo produto: R$");
		double segunProd = scan.nextDouble();
		
		System.out.println("Entre com o preço do terceiro produto: R$");
		double tercProd = scan.nextDouble();
		
		
		if (primProd < segunProd && primProd < tercProd) {
			System.out.println("Compre o primeiro produto. O primeiro produto custa R$" + primProd + " reais.");
		}else if (segunProd < primProd && segunProd < tercProd) {
			System.out.println("Compre o segundo produto. O segundo produto custa R$" + segunProd + " reais.");
		}else if (tercProd < primProd &&tercProd < segunProd) {
			System.out.println("Compre o terceiro produto. O terceiro produto custa R$" + tercProd + " reais.");
		}else {
			System.out.println("Preço do produto inválido.");
		}
	}

}
