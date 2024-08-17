package com.loaine.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] jogoDaVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {

			if (jogada % 2 == 1) {
				sinal = 'X';
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				
			}else {
				sinal = 'O';
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				
			}
			
			boolean linhaValida = false;
			
			while(!linhaValida) {
				
				System.out.println("Entre com a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				}else {
					System.out.println("Linha inválida, tente novamente.");
				}
			}
			
			boolean colunaValida = false;
			
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3)");
				coluna = scan.nextInt();
				
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
					
				}else {
					System.out.println("Coluna inválida, tente novamente.");
				}
			}
			
			linha--;
			coluna--;
			
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente.");
				
			}else { // jogada válida
				jogoDaVelha[linha][coluna] = sinal;
				jogada++;
			}
			
			//Imprimir tabuleiro
			for(int i = 0; i<jogoDaVelha.length; i++) {
				for(int j = 0; j<jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
			//Verifica se tem ganhador
			if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || //linha 1
					(jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || //linha 2
					(jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || //linha 3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || //coluna 1
					(jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || //coluna 2
					(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || //coluna 3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X')) { //diagonais
			ganhou = true;
				System.out.println("Jogador 1 venceu!");
				
			} else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || //linha 1
			 		(jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || //linha 2
					(jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || //linha 3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || //coluna 1
					(jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || //coluna 2
					(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || //coluna 3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O')) { //diagonais
			ganhou = true;
				System.out.println("Jogador 2 venceu!");
				
			} else if (jogada > 9){
				ganhou = true;
				System.out.println("Ninguém ganhou essa partida.");
			}
		
		}
		
	}
}
