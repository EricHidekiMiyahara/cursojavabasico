package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número (1-10) para ver a tabuada: ");
		int num = scan.nextInt();
		
		int resultado = 0;
		
		if (num >= 1 && num <= 10) {
			System.out.println("Tabuada de " + num);
			System.out.println(" ");
			
			for (int i = 1; i <= 10; i++) {
				resultado = num * i;
				System.out.println(num + " X " + i + " = " + resultado);
			}
				
			}else {
				System.out.println("Número inválido!");
			}
			
	}
}
