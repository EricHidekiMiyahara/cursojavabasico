package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de turmas: ");
		int qtdTurmas = scan.nextInt();
		
		int numAlunos;
		int soma = 0;
		boolean invalido = true;
		
		for (int i = 1; i <= qtdTurmas; i++) {
			
			invalido = true;
			do {
			System.out.println("Entre com a quantidade de alunos da turma " + i);
			numAlunos = scan.nextInt();
			
				if(numAlunos <= 40) {
					invalido = false;
				}else {
					System.out.println("Número de alunos inválido. Tente novamente.");
				}
			}while(invalido);
			
			soma += numAlunos;
		}
		
		double media = soma / qtdTurmas;
		
		System.out.println("Média: " + media);
	}
}

