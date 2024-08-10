package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int num = scan.nextInt();
		
		int fatorial = 1 ;
		System.out.print(num + "! = ");

		for (int i = num; i > 0; i--) {
			fatorial *= i;
			System.out.print(i + " * ");
		}
		System.out.println("");
		System.out.println("Resultado: " + fatorial);
	}

}
