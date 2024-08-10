package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma = 0;
		
		System.out.println("Entre com um número inteiro: ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com outro número inteiro: ");
		num2 = scan.nextInt();
		
		for(int i = num1; i <= num2; i++) {
			soma += i;
		}
		
		System.out.println("A soma dos números é de: " + soma);
	}

}
