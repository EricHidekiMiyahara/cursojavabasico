package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Forneça o primeiro número: ");
		
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Forneça o segundo número: ");
		
		double segundoNumero = scan.nextDouble();
		
		System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " é igual a " + (primeiroNumero + segundoNumero));
		
		double resultado = primeiroNumero + segundoNumero;
		
		System.out.println("Soma: " + primeiroNumero + " + " + segundoNumero + " = " + resultado);
	}

}
