package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de notas: ");
		int qtdNotas = scan.nextInt();
		
		double soma = 0;
		double nota;
		double media;
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.println("Entre com a nota " + (i+1));
			nota = scan.nextDouble();
			soma += nota;
		}
		
		media = soma / qtdNotas;
		
		System.out.println("A sua soma foi de: " + soma);
		System.out.println("A sua média foi de: " + media);
	}

}
