package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora trabalhada: ");
		double valorHora = scan.nextInt();
		
		System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
		double qtdHoras = scan.nextInt();
		
		double salarioBruto = valorHora * qtdHoras;
		double percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		}else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		}else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: (" + qtdHoras + " * " + valorHora + "): R$"+  salarioBruto + " reais.");
		System.out.println("Imposto de renda: (" + percentualIR + "%)" + " R$" + ir + " reais.");
		System.out.println("INSS: (10%) R$" + inss + " reais.");
		System.out.println("FGTS: (11%) R$" +	fgts + " reais.");
		System.out.println("Total de descontos: R$" + totalDescontos + " reais.");
		System.out.println("Salário líquido: R$" + salarioLiquido + " reais.");
	}

}
