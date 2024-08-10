package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o tamanho do arquivo para download? (Em MB) ");
		double tamanho = scan.nextInt();
		
		System.out.println("Qual é a velocidade de um link de Internet? (Em Mbps)");
		double velocidade = scan.nextInt();
		
		double tempo = (tamanho / velocidade) / 60;
		
		System.out.println("O tempo aproximado do download do arquivo em minutos foi de " + tempo + " minutos.");
		
	}

}
