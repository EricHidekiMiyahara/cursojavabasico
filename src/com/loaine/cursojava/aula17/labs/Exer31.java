package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		String simNao;
		int qtdProd;
		double preco;
		double total;
		String output;
		double dinheiro, troco;
		
		do {
			
			System.out.println("Deseja informar uma nova compra? [S/N]");
			simNao = scan.next();
			
			if(simNao.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra: ");
				qtdProd = scan.nextInt();
			
				total = 0;
				
				for(int i = 1; i <= qtdProd; i++) {
					System.out.println("Entre com o preço do produto " + i + " R$: ");
					preco = scan.nextDouble();
					
					output += "Produto " + i + ": R$ " + preco + "\n";
					
					total += preco;
				}
				
				output += "Total: R$ " + total + "\n";
				
				System.out.println("Total: R$ " + total);
				
				System.out.println("Entre com o valor pago: R$");
				dinheiro = scan.nextDouble();
				
				output += "Dinheiro: R$ " + dinheiro + "\n";
				
				troco = total - dinheiro;
				
				output += "Troco: R$ " + troco;
				
				System.out.println(output);
				
			}else {
				sair = true;
				System.out.println("Compra finalizada.");
				output = "0";
				System.out.println(output);
			}
			
		}while(!sair);
	}

}
