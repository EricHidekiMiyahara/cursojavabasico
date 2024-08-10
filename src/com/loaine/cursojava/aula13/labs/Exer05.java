package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos metros tem? ");
		double metros = scan.nextDouble();
		double centimetros = metros * 100;
		System.out.println(metros + " metros tem " + centimetros + " centímetros.");
	}

}
