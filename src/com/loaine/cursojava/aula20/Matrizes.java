package com.loaine.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 9;
		notasAlunos[0][2] = 7.4;
		notasAlunos[0][3] = 8.4;
		
		notasAlunos[1][0] = 8.2;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 6.4;
		notasAlunos[1][3] = 9.4;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for(int i = 0; i<notasAlunos.length; i++) {
			//System.out.print(notasAlunos[i] + " ");
			for(int j = 0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		notasAlunos[0][1] = 10;
		
		for(int i = 0; i<notasAlunos.length; i++) {
			//System.out.print(notasAlunos[i] + " ");
			for(int j = 0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Calculando a média de cada aluno");
		
		double soma;
		
		for(int i = 0; i<notasAlunos.length; i++) {
			
			soma = 0;
			
			for(int j = 0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j]; 
			}
			
			System.out.println("A média do aluno " + i + " é de: " + soma/4	);

		}
		
		System.out.println();
		
		System.out.println("Output da matriz notasAluno2");
		
		double[] notasAluno1 = {7, 8, 9, 10};
		
		double[][] notasAluno2 = {{4, 9, 10, 2}, {2, 4, 1, 9}};
		
		for(int i = 0; i<notasAluno2.length; i++) {
			for(int j = 0; j<notasAluno2[i].length; j++) {
				System.out.print(notasAluno2[i][j] + " - ");
			}
			
			System.out.println();
		}
	}

}
