package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a sua altura? ");
		
		double altura = scan.nextFloat();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Com " + altura + " metros, o seu peso ideal é de " + pesoIdeal + " kg.");
	}

}
