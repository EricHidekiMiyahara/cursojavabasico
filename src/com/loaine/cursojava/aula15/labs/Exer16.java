package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a: ");
		double a = scan.nextDouble();
		
		
		if (a == 0) {
			System.out.println("A equação não é do segundo grau.");
			
		}else if (a != 0){
			
			System.out.println("Entre com o valor de b: ");
			double b = scan.nextDouble();
			
			System.out.println("Entre com o valor de c: ");
			double c = scan.nextDouble();
			
			double delta = Math.pow(b, 2) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais.");
				
			}else if (delta == 0) {
				
				System.out.println("Delta: " + delta);
				
				double x1 = (-b + Math.sqrt(delta)) / 2 * a;
				double x2 = (-b - Math.sqrt(delta)) / 2 * a;
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				System.out.println("A equação possui apenas uma raíz real.");
				
			}else {
				System.out.println("A equação possui duas raízes reais.");
			}
			
		}else {
			System.out.println("Valor inválido!");
		}
	}
}
