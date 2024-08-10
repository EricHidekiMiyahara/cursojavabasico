package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdTemperaturas;
		double temp, soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		System.out.println("Entre com a quantidade de temperaturas: ");
		qtdTemperaturas = scan.nextInt();
		
		for(int i = 1; i <= qtdTemperaturas; i++) {
			System.out.println("Entre com a " + i + "º temperatura: ");
			temp = scan.nextDouble();
			
			soma += temp;
			
			if(temp > maior) {
				maior = temp;
			}
			
			if(temp < menor) {
				menor = temp;
			}
		
		}
		
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Média de temperatura: " + (soma / qtdTemperaturas));
		
	}
}
