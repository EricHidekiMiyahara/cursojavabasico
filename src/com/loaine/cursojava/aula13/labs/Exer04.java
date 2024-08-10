package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a primeira nota do bimestre? ");
		
		float primeiraNota = scan.nextFloat();
		
		System.out.println("Qual é a segunda nota do bimestre? ");
		
		float segundaNota = scan.nextFloat();
		
		System.out.println("Qual é a terceira nota do bimestre? ");
		
		float terceiraNota = scan.nextFloat();
		
		System.out.println("Qual é a quarta nota do bimestre? ");
		
		float quartaNota = scan.nextFloat();
		
		System.out.println("A média da soma de " + primeiraNota + " + " + segundaNota + " + " + terceiraNota + " + " + quartaNota + " foi de: " + ((primeiraNota + segundaNota + terceiraNota + quartaNota)/4) + " pontos.");
		
		float media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		
		System.out.println("A média das 4 notas bimestrais foi de: " + media + " pontos.");
	}

}
