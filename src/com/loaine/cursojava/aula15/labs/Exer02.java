package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Forneça um valor: ");
		int valor = scan.nextInt();
		
		if (valor < 0) {
			System.out.println(valor + " é um valor negativo.");
		}else {
			System.out.println(valor + " é um valor positivo.");
		}
	}

}
