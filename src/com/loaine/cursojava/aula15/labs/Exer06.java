package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre com o terceiro número: ");
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 é o maior número. " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 é o maior número. " + num2);
		}else if (num3 > num1 && num3 > num2){
			System.out.println("num3 é o maior número. " + num3);
		// else é opcional
		} else {
			System.out.println("Número inválido.");
	}
  }
}
