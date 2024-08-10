package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora trabalhada? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Qual foi o seu número de horas trabalhadas no mês? ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = ganhoHora * horasTrabalhadas;
		System.out.println("O seu salário bruto é de: R$ " + salarioBruto + " reais.");
		
		double inss = salarioBruto * 0.08;
		System.out.println("Você pagou R$ " + inss + " reais para o INSS.");
		
		double sindicato = salarioBruto * 0.05;
		System.out.println("Você pagou R$ " + sindicato + " reais para o sindicato.");
		
		double ir = (salarioBruto / 100) * 11;
		System.out.println("Você pagou R$ " + ir + " reais de imposto de renda.");
		
		double totalDescontos = inss + sindicato + ir;
		System.out.println("O total de descontos é de R$ " + totalDescontos + " reais.");
		
		double salarioLiquido = salarioBruto - (salarioBruto * 0.11) - sindicato - inss;
		System.out.println("O seu salário líquido é de R$ " + salarioLiquido + " reais.");
	}
	

}
