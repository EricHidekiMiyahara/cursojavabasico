package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da série de Fibonacci: ");
		int nEsimo = scan.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		int proxNum;
		
		System.out.println(num1);
		System.out.println(num2);

		for (int i = 3; i <= nEsimo; i++) {
			proxNum = num1 + num2;
			num1 = num2;
			num2 = proxNum;
			
			System.out.println(proxNum);
		}
	}

}
