package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double populacaoA;
		double populacaoB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;
		do {
			
			System.out.println("Entre com a população A: ");
			populacaoA = scan.nextDouble();
			
			if (populacaoA > 0) {
				valido = true;
			}else {
				System.out.println("População A precisa ser maior do que 0.");
			}
			
		} while (!valido);
		
		valido = false;
		do {
			
			System.out.println("Entre com a população B: ");
			populacaoB = scan.nextDouble();
			
			if (populacaoB > 0) {
				valido = true;
			}else {
				System.out.println("População B precisa ser maior do que 0.");
			}
			
		} while (!valido);
		
		valido = false;
		do {
			
			System.out.println("Entre com a taxa de crescimento da população A: ");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			}else {
				System.out.println("A taxa de crescimento da população A precisa ser maior do que 0.");
			}
			
		} while (!valido);

		valido = false;
		do {
			
			System.out.println("Entre com a taxa de crescimento da população B: ");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			}else {
				System.out.println("A taxa de crescimento da população B precisa ser maior do que 0.");
			}
			
		} while (!valido);

		int cont = 0; 
		
		while(populacaoA < populacaoB) {
			populacaoA += (populacaoA / 100) * taxaA;
			populacaoB += (populacaoB / 100) * taxaB;
			cont++;
		}
		
		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);
		System.out.println("Quantidade de anos: " + cont);
		
	}
}