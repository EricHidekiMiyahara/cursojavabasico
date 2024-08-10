package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Forneça o primeiro número inteiro: ");
		int primeiroInt = scan.nextInt();
		
		System.out.println("Forneça o segundo número inteiro: ");
		int segundoInt = scan.nextInt();
		
		System.out.println("Forneça um número real: ");
		double real = scan.nextDouble();
		
		int a = (2 * primeiroInt) * (segundoInt / 2);
		System.out.println("A letra a deu: " + a);
		
		double b = (3 * primeiroInt) + real;
		System.out.println("A letra b deu: " + b);
		
		// double c = real * real * real;
		double c = Math.pow(real, 3);
		System.out.println("A letra c deu: " + c);
	}

}
