package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int contPar = 0;
		int contImpar = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Entre com um número: ");
			int num = scan.nextInt();
			
			if (num % 2 == 0) {
				contPar++;
				
			}else {
				contImpar++;
			}
		}
		System.out.println("A quantidade de número pares foi de: " + contPar);
		System.out.println("A quantidade de números ímpares foi de: " + contImpar);
	}

}
