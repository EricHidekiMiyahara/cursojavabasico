package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Entre com a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7 && media != 10) {
			System.out.println("Aprovado com " + media + " de média.");
		}else if (media < 7) {
			System.out.println("Reprovado com " + media + " de média.");
		}else if (media == 10){
			System.out.println("Aprovado com distinção.");
		}
	}
}
