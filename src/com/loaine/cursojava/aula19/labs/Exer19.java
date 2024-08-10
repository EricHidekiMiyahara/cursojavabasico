package com.loaine.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];	
		
		double media = 0;
		
		for(int i = 0; i<nota1.length; i++) {
			System.out.println("Entre com a primeira nota bimestral do " + (i+1) + "º aluno:");
			nota1[i] = scan.nextDouble();
		}
		
		for(int i = 0; i<nota2.length; i++) {
			System.out.println("Entre com a segunda nota bimestral do " + (i+1) + "º aluno:");
			nota2[i] = scan.nextDouble();
			
		}
		
		System.out.print("Primeiras notas do bimestre = ");
		
		for(int i = 0; i<nota1.length; i++) {
			System.out.print(nota1[i] + " ");
		}
		System.out.println();
		
		System.out.print("Segundas notas do bimestre = ");
		
		for(int i = 0; i<nota2.length; i++) {
			System.out.print(nota2[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Resultados: ");
		
		for(int i = 0 ; i<result.length; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			System.out.println("Média do " + (i+1) + "º aluno: " + media);
			
			if(media >= 7) {
				System.out.println("O " + (i+1) + "º aluno está aprovado");
				System.out.println();
			}else {
				System.out.println("O " + (i+1) + "º aluno está reprovado.");
				System.out.println();
			}
		}
		
	}

}
