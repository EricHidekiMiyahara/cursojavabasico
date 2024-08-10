package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com a nota (0-10): ");
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10){
				notaValida = true;
				System.out.println("Nota: " + nota);
			}else {
				// notaValida = false;
				System.out.println("Nota inválida! Digite novamente.");
			}
		}while (notaValida == false);
	}
}
