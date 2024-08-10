package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		
		System.out.println("Entre com um número inteiro: ");
		num = scan.nextInt();
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				primo = false;
				System.out.println(num + " não é primo. Divisível por " + i + ".");
			}
			
		}
		
		if(primo) {
			System.out.println(num + " é primo.");
		}
		
	}

}
