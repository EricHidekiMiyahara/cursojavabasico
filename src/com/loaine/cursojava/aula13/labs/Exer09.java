package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura em ° Fahrenheit? ");
		
		float fahrenheit = scan.nextFloat();
		float celsius = (5 * (fahrenheit - 32) / 9);
		
		System.out.println(fahrenheit + "°F é igual a " + celsius + "°C.");
	}

}
