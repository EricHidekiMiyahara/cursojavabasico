package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima? ");
		String resp1 = scan.nextLine();
		
		System.out.println("Esteve no local do crime? ");
		String resp2 = scan.nextLine();
		
		System.out.println("Mora perto da vítima? ");
		String resp3 = scan.nextLine();
		
		System.out.println("Devia para a vítima? ");
		String resp4 = scan.nextLine();
		
		System.out.println("Já trabalhou com a vítima? ");
		String resp5 = scan.nextLine();
		
		int cont = 0;
		
		if(resp1.equalsIgnoreCase("Sim")) {
			cont++;
		}
		
		if(resp2.equalsIgnoreCase("Sim")) {
			cont++;
		}
		
		if(resp3.equalsIgnoreCase("Sim")) {
			cont++;
		}
		
		if(resp4.equalsIgnoreCase("Sim")) {
			cont++;
		}
		
		if(resp5.equalsIgnoreCase("Sim")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita");
		}else if (cont >= 3 && cont <= 4) {
			System.out.println("Cúmplice");
		}else if (cont == 5) {
			System.out.println("Assasino");
		}else {
			System.out.println("Inocente");
		}
	}
}
