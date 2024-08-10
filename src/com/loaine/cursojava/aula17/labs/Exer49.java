package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer49 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n termos da série a seguir: ");
		int n = scan.nextInt();
		
		double soma = 0;
		
		for (int i = 1, j = 1; i <= n; i++, j += 2) {
			
			System.out.print(i + "/" + j + " + ");
			
			soma += i / j;
			
		}
		
		System.out.print("\nSoma = " + soma);

	}

}
