package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o salário do colaborador: R$");
		double salario = scan.nextDouble();
		
		/*int percentual;
		if (salario <= 280) {
			double reajuste = salario * 0.2;
			double novosalario = salario + reajuste;
			percentual = 20;
			System.out.println(salario + " reais com o reajuste de " + percentual + "% ficará R$" + reajuste + " reais. O seu novo salário ficou R$" + novosalario + " reais.");
		}else if (salario > 280 && salario <= 700) {
			double reajuste = salario * 0.15;
			double novosalario = salario + reajuste;
			percentual = 15;
			System.out.println(salario + " reais com o reajuste de 15% ficará R$" + reajuste + " reais. O seu novo salário ficou R$" + novosalario + " reais.");
		}else if (salario > 700 && salario <= 1500) {
			double reajuste = salario * 0.10;
			double novosalario = salario + reajuste;
			percentual = 10;
			System.out.println(salario + " reais com o reajuste de 10% ficará R$" + reajuste + " reais. O seu novo salário ficou R$" + novosalario + " reais.");
		}else {
			double reajuste = salario * 0.05;
			double novosalario = salario + reajuste;
			percentual = 5;
			System.out.println(salario + " reais com o reajuste de 5% ficará R$" + reajuste + " reais. O seu novo salário ficou R$" + novosalario + " reais.");
		}*/
		int percentual = 0;
		double aumento = 0;
		double novoSalario = 0;
		
		if (salario <=280) {
			percentual = 20;
			aumento = (salario * percentual) / 100;
			novoSalario = salario + aumento;
		}else if (salario > 280 && salario < 700) {
			percentual = 15;
			aumento = (salario * percentual) / 100;
			novoSalario = salario + aumento;
		}else if (salario >= 700 && salario < 1500) {
			percentual = 10;
			aumento = (salario * percentual) / 100;
			novoSalario = salario + aumento;
		}else if (salario >= 1500) {
			percentual = 5;
			aumento = (salario * percentual) / 100;
			novoSalario = salario + aumento;
		}else {
			System.out.println("Salário inválido.");
		}
		
		System.out.println("Salário antes do reajuste: R$" + salario + " reais.");
		System.out.println("Percentual do aumento: " + percentual + "%.");
		System.out.println("Valor do aumento: R$" + aumento + " reais.");
		System.out.println("Novo salário: R$" + novoSalario + " reais.");
	}

}
