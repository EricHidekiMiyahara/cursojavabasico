package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Forneça uma letra: ");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println(letra + " é igual feminina.");
		}else if (letra.equalsIgnoreCase("m")) {
			System.out.println(letra + " é igual masculino.");
		}else {
			System.out.println("Sexo inválido.");
		}
	}

}
