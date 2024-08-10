package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Forneça o primeiro número: ");
		int num1 = scan.nextInt();
	
		System.out.println("Forneça o segundo número: ");
		int num2 = scan.nextInt();
	
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
			// else if (num2 > num1){
			// 	System.out.println(num1 + " é menor que " + num2); }
		} else if (num1 < num2) {
			System.out.println(num2 + " é maior que " + num1);
		}else {
			System.out.println("Número inválido.");
		}
	}
}
