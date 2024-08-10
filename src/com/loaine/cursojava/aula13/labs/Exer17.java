package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o tamanho em metros ao quadrado da área, a serem pintadas? ");
		
		double metrosQuadrados = scan.nextDouble();
		
		double coberturaTinta = metrosQuadrados / 6;
		
		double latasTintas = coberturaTinta / 18;
		
		double precoLatas = latasTintas * 80;
		
		System.out.print("Você precisará comprar " + latasTintas + " latas de tinta com apenas latas de 18 litros.");
		System.out.println("Isso custará R$ " + precoLatas + " reais.");
		
		double galoesTintas = coberturaTinta / 3.6;
		
		double precoGaloes = 25 * galoesTintas;
		
		System.out.print("Você precisará comprar " + galoesTintas + " galões de tinta com apenas galões de 3,6 litros.");
		System.out.println("Isso custará R$ " + precoGaloes + " reais.");
		
		
	}

}
