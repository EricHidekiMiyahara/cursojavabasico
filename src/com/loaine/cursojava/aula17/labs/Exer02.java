package com.loaine.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean diferente = false;
		String nomeUsuario;
		String senha;
		
		do {
			
			System.out.println("Entre com o nome de usuário: ");
			nomeUsuario = scan.next();
		
			System.out.println("Entre com a senha: ");
			senha = scan.next();
			
			if (nomeUsuario.equalsIgnoreCase(senha)) {
				// diferente = false;
				System.out.println("Erro, entre novamente com as informações.");
			}else{
				diferente = true;
				System.out.println("O nome de usuário é diferente da senha.");			}
		
		} while(!diferente);
	}

}
