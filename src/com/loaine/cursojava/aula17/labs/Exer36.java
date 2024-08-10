package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tabuada, inicio, fim, resultado;
		boolean invalido = false;
		
		while (!invalido) {
			
			System.out.println("Montar a tabuada de: ");
			tabuada = scan.nextInt();
			
			System.out.println("Começar por: ");
			inicio = scan.nextInt();
				
			System.out.println("Terminar em: ");
			fim = scan.nextInt();
			
			System.out.println();
			
			if (fim < inicio) {
				
				System.out.println("Você digitou o valor final menor do que o valor inicial. Tente novamente.");
				
			}else {
				
				invalido = true;
				System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + inicio + " e terminando em " + fim + ":");
				
				for(int i = inicio; i <= fim; i++) {
					
					System.out.print(tabuada + " X " + i + " = ");
					resultado = tabuada * i;
					System.out.println(resultado);

				}
			}
		}
	}

}
