package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre com uma operação matemática (+ - / *): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
			case "+": resultado = num1 + num2; break;
			case "-": resultado = num1 - num2; break;
			case "/": resultado = num1 / num2; break;
			case "*": resultado = num1 * num2; break;
			default:  
				System.out.println("Operação inválida!"); 
				valida = false;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado % 2 == 0) {
				System.out.println("Par");
			}else{
				System.out.println("Ímpar");
			}
		
			if (resultado >= 0) {
				System.out.println("Positivo");
			}else{
				System.out.println("Negativo");
			
		}
		
	   }
	}	
}
