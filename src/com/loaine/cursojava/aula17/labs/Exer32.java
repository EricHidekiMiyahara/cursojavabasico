package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, fatorial;
		
		System.out.println("Entre com um número inteiro: ");
		num = scan.nextInt();
		
		System.out.println("Fatorial de: " + num);
		
		System.out.print(num + "! = ");
		
		fatorial = 1;
		for (int i = num; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.println("1 = " + fatorial);
	}
}
