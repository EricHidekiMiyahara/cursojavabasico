package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean primo;
		
		System.out.println("Entre com um número inteiro: ");
		num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			primo = true;
			
			for(int j = 2; j < i; j++) {
				
				if(i % j == 0) {
					primo = false;
					// System.out.println(i + " não é um número primo. Divisível por " + j + ".");
				}
			}
		
			if(primo) {
				System.out.println(i + " é um número primo.");
			}
			
		}
	}
}
