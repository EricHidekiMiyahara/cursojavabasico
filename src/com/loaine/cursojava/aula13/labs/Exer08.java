package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Qual é o seu número de horas trabalhadas no mês? ");
		int horasTrabalhadas = scan.nextInt();
		
		double salario = ganhoHora * horasTrabalhadas;
		System.out.println("O seu salário no referido mês vai ser de: R$ " + salario + " reais.");
	}

}
