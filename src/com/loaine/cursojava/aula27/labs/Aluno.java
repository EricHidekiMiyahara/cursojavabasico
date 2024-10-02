package com.loaine.cursojava.aula27.labs;

public class Aluno {
	
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for (int i = 0; i <notasDisciplinas.length; i++) {
			
		}
	}
	
	
}
