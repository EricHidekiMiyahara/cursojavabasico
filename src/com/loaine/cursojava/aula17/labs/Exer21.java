package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Entre com um número inteiro: ");
		num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				primo = false;
				System.out.println("Não é um número primo. Divisível por " + i);
			}
		}
		if(primo) {
			System.out.println("É um número primo.");
		}
	}

}
