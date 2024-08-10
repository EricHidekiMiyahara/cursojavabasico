package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número da base: ");
		double numBase = scan.nextInt();
		
		System.out.println("Entre com o número do expoente: ");
		double numExp = scan.nextInt();
		
		double resultado = numBase;
		
		for (double i = 1; i < numExp; i++) {
			resultado *= numBase;
		}
		
		System.out.println(numBase + "^" + numExp + " é igual a: " + resultado);
	}

}
