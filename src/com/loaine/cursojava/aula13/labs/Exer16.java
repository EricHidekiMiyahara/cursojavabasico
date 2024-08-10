package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o tamanho em metros ao quadrado da área a ser pintada? ");
		
		double tamanhoMetrosQuad = scan.nextDouble(); 
		
		double coberturaTinta = tamanhoMetrosQuad / 3;
		
		double tintasAComprar = coberturaTinta / 18;
		
		double precoTotal = 80 * tintasAComprar;
		
		System.out.println("Você precisará de " + tintasAComprar + " tintas para serem compradas.");
		
		System.out.println("E o preço total foi de: R$ " + precoTotal + " reais.");
	}

}
