package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual foi o peso dos peixes? ");
		float peso = scan.nextFloat();
		
		boolean excesso = (peso > 50);
		System.out.println("O peso dos peixes excedeu o limite? " + excesso);
		float pesoMaior = scan.nextFloat();
		
		double multa = (pesoMaior * 4) - 50;		
		System.out.println("O valor da multa que o João deverá pagar vai ser de: R$" + multa + " reais.");
	}

}
