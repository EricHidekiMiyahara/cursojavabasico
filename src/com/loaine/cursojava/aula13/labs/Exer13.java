package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float altura = scan.nextFloat();
		
		float sexo = scan.nextFloat();
		
		System.out.println("Você é homem ou mulher? ");
		
		double pesochomem = (72.7 * altura) - 58; 
		
		double pesomulher = (62.1 * altura) - 44.7;
		
		System.out.println("Qual é o seu peso? ");
		
		float peso = scan.nextFloat();
		
		
		
		
	}

}
