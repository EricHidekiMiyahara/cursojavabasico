package com.loaine.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer03 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matrícula");
		aluno.matricula = scan.next();
		
		// aluno.nomeDisciplinas = new String[3];
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i+1));
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas das disciplinas" + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas.length; j++) {
				System.out.println("Entre com a nota" + (j + 1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
	}
}
