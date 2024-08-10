package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Entre com um número inteiro: ");
		num1 = scan.nextInt();
			
		System.out.println("Entre com outro número inteiro: ");
		num2 = scan.nextInt();
			
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
	}

}
