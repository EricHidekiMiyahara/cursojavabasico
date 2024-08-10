package com.loaine.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* System.out.println("Entre com a sua idade: ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade com " + idade + " anos.");
		}else {
			System.out.println("Você é menor de idade.");
		} */
		
		/* barato <=10
		 * 10 < valor < 15 - pedir desconto
		 * 15 <= valor < 17 - pesquisar mais
		 * >= 17 - muito caro
		 */
		
		System.out.println("Entre o valor do produto: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("O produto de R$ " + valor + " reais está barato, pode comprar.");
		}else if (valor > 10 && valor < 15){
			System.out.println("O produto é de R$ " + valor + " reais, quero um desconto.");
		}else if (valor >= 15 && valor < 17) {
			System.out.println("O produto é de R$ " + valor + " reais, tenho que pesquisar mais.");
		}else { // valor >= 17
			System.out.println("O produto de R$ " + valor + " reais está muito caro, não pode comprar.");
		}
		
	}
}
