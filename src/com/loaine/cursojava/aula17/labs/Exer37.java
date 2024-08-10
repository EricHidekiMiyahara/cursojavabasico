package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, numInicio, numFinal, resultado;
		boolean invalido = false;
		
		do {
			
			System.out.println("Entre com um número para gerar a tabuada: ");
			num = scan.nextInt();
			
			System.out.println("Entre com o início da tabuada");
			numInicio = scan.nextInt();
			
			System.out.println("Entre com o final da tabuada");
			numFinal = scan.nextInt();
			
			System.out.println();
			
			if (numFinal < numInicio) {
				
				System.out.println("Você digitou o número final menor do que o número inicial. Tente novamente.");
				
			}else {
				
				invalido = true;
				System.out.println("Vou montar a tabuada de " + num + " começando de " + numInicio + " e terminando em " + numFinal + ":");
				
				for (int i = numInicio; i <= numFinal; i++) {
					
					System.out.print(num + " X " + i + " = ");
					resultado = num * i;
					System.out.println(resultado);
					
				}
			}
			
		}while(!invalido);
	}
}
