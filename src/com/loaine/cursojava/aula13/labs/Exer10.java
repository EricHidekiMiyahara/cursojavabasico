package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura em °C? ");
		
		float c = scan.nextFloat();
		
		float f = ((9 * c) / 5) + 32;
		
		System.out.println(c + "°C é igual a " + f + "°F.");
	}

}
