package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer50 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de termos: ");
		int n = scan.nextInt();
		
		double h = 0;
		
		System.out.print("H = 1 + ");
		
		for (int i = 1; i < n; i++) {
			
			System.out.print(1 + "/" + i + " + ");
			
			h += 1 / i;
			
		}
		
		System.out.println("\nH = " + h);
	}

}
