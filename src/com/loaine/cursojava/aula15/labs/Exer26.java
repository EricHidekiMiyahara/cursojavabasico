package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número de litros vendidos: ");
		double litros = scan.nextDouble();
		
		System.out.println("Tipo de combustível A-álcool, G-gasolina: ");
		String combustivel = scan.next();
		
		double precoG = 2.5;
		double precoA = 1.9;
		int percentualDesconto = 0;
		double total = 0;
		
		if (combustivel.equalsIgnoreCase("A")) {
			
			if (litros <= 20) {
				double desconto = litros * 0.03;
				percentualDesconto = 3;
				System.out.println("Com " + litros + 
						" litros, o desconto por litro vai ser de " 
						+ percentualDesconto + 
						"% e o valor do desconto do álcool é de R$: " 
						+ desconto);
				
				total = litros * 1.9;
				System.out.println("O preço total por litros do álcool foi de R$: " + total);
				
				double pagamento = (precoA * litros) - desconto;
				System.out.println("Valor a ser pago do álcool R$: " 
				+ pagamento);
			
			}else {
				double desconto = litros * 0.05;
				percentualDesconto = 5;
				System.out.println("Com " + litros 
						+ " litros, o desconto por litro vai ser de " 
						+ percentualDesconto + 
						"% e o valor do desconto do álcool é de R$: " 
						+ desconto);
				
				total = litros * 1.9;
				System.out.println("O preço total por l"
						+ "itros de álcool vai ser de R$: ");
				
				double pagamento = (precoA * litros) - desconto;
				System.out.println("Valor a ser pago do álcool  R$: " 
				+ pagamento);
			}
		}
		if (combustivel.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				double desconto = litros * 0.04;
				percentualDesconto = 4;
				
				System.out.println("Com " + litros + 
						" litros, o desconto por litro vai ser de " 
						+ percentualDesconto + 
						"% e o valor do desconto da gasolina é de R$: "
						+ desconto);
				
				total = litros * 2.5;
				System.out.println("O preço total por litros de gasolina vai ser de R$: " + total);
				
				double pagamento = (precoG * litros) - desconto;
				System.out.println("Valor a ser pago da	gasolina R$: " 
				+ pagamento);
			
			}else {
				double desconto = litros * 0.06;
				percentualDesconto = 6;
				System.out.println("Com " + litros + 
						" litros, o desconto por litro vai ser de "
						+ percentualDesconto + 
						"% e o valor do desconto do gasolina é de R$: "
						+ desconto);
			
				total = litros * 2.5;
				System.out.println("O preço total por litros de gasolina vai ser de R$: " + total);
				
				double pagamento = (precoG * litros) - desconto;
				System.out.println("Valor a ser pago da gasolina R$: " 
				+ pagamento);
			}
		}
	}

}
