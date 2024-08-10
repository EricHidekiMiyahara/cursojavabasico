package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer43 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cod, qtd;
		boolean naoTerminar = true;
		double total = 0;
		String output = "";
		
		do {
			
			System.out.println("Entre com o código e a quantidade de comida. Digite 0 0 para sair.");
			cod = scan.nextInt();
			qtd = scan.nextInt();
		
			if (cod == 0 && qtd == 0) {
				
				naoTerminar = false;
				output += "Total a pagar: R$" + total;
				
			}else {
				
				if (cod == 100) {
					
					output += "Cachorro Quente -> R$ 1,20 * " + qtd;
					output += " = " + " R$" + 1.2 * qtd + "\n";
					total += 1.2 * qtd;
					
				}else if (cod == 101) {
					
					output += "Bauru Simples -> R$ 1,30 * " + qtd ;
					output += " = " + " R$" + 1.3 * qtd + "\n";
					total += 1.3 * qtd;

					
				}else if (cod == 102) {
					
					output += "Bauru com ovo -> R$ 1,50 * " + qtd ;
					output += " = " + " R$" + 1.5 * qtd + "\n";
					total += 1.5 * qtd;

					
				}else if (cod == 103) {
					
					output += "Hambúrguer -> R$ 1,20 * " + qtd ;
					output += " = " + " R$" + 1.2 * qtd + "\n";
					total += 1.2 * qtd;

				}else {
					
					output += "Cheeseburguer -> R$ 1,30 * " + qtd ;
					output += " = " + " R$" + 1.3 * qtd + "\n";
					total += 1.3 * qtd;
					
				}
			}
		}while(naoTerminar);
		
		System.out.println(output);
		
	}
}
