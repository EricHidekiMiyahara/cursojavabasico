package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		
		String nome;
		int idade;
		double salario;
		String sexo;
		String estCivil;
		
		do {
			
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			
			if (nome.length() > 3) {
				infoValida = true;
				System.out.println(nome + " é um nome válido!");
			}else {
				System.out.println(nome + " é um nome inválido!");
			}
			
		} while(!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com a idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
				System.out.println(idade + " é uma idade válida!");
			}else {
				System.out.println(idade + " é uma idade inválida!");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com o salário R$: ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
				System.out.println(salario + " é um salário válido.");
			}else {
				System.out.println(salario + " não é um salário válido.");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com o sexo: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
				System.out.println(sexo + " é um sexo válido.");
			}else {
				System.out.println(sexo + " é um sexo inválido.");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com o estado civil: ");
			estCivil = scan.next();
			
			if (estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || estCivil.equalsIgnoreCase("v") || estCivil.equalsIgnoreCase("d")) {
				infoValida = true;
				System.out.println(estCivil + " é um estado civil válido.");
			}else {
				System.out.println(estCivil + " é um estado civil inválido.");
			}
			
		}while(!infoValida);
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(sexo);
		System.out.println(estCivil);


	}

}
