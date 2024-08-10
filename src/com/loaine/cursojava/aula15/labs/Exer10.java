package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda? M- Matutino, V- Vespertino ou N- Noturno");
		
		String turno = scan.next();
		
		/*
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
			
		}else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
			
		}else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Valor inválido!");
		}*/
		
		switch(turno) {
		case "m": 
		case "M": System.out.println("Bom dia!"); break;	
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inválido!");
		}
	}
}
