package com.loaine.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz3x3 = new int[3][3];
		
		for(int i = 0; i<matriz3x3.length; i++) {
			for(int j = 0; j<matriz3x3[i].length; j++) {
				System.out.println("Entre com valor da posição [" + i + ", " + j + "]:");
				matriz3x3[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Matriz 3x3: ");
		for(int i = 0; i<matriz3x3.length; i++) {
			for(int j = 0; j<matriz3x3[i].length; j++) {
				System.out.print(matriz3x3[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for(int i = 0; i<matriz3x3.length; i++) {
			for(int j = 0; j<matriz3x3.length; j++) {
				if(matriz3x3[i][j] % 2 == 0) {
					qtdPares++;
				}else {
					qtdImpares++;
				}
			}
		}
		
		System.out.println("Quantidade de pares: " + qtdPares);
		System.out.println("Quantidade de ímpares: " + qtdImpares);
		
		
	}

}
