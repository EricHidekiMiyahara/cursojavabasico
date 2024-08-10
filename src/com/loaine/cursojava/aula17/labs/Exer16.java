package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int num1 = 1;
		int num2 = 1;
		int proximo = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		while(proximo <= 500) {
			
			proximo = num1 + num2;
			num1 = num2;
			num2 = proximo;
			
			System.out.println(proximo);
		}
	}

}
