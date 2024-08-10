package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de idades: ");
		int qtdIdade = scan.nextInt();
		
		int idade;
		int soma = 0;
		
		for (int i = 0; i < qtdIdade; i++) {
			System.out.println("Entre com sua idade " + (i+1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		
		double media = soma / qtdIdade;
		
		System.out.println("A soma das idades é " + soma);
		System.out.println("A média é " + media);
		
		if (media >= 0 && media <= 25) {
			System.out.println("A turma é jovem.");
		}else if (media >= 26 && media <= 60) {
			System.out.println("A turma é adulta.");
		}else {
			System.out.println("A turma é idosa.");
		}
	}

}
