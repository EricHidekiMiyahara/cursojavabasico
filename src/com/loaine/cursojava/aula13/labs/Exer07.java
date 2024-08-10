package com.loaine.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto mede o lado do quadrado? ");
		
		double lado = scan.nextFloat();
		
		//area = lado * lado
		double areaQuadrado = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é de " + areaQuadrado + " metros ao quadrado.");
		
		double dobro = areaQuadrado * 2;
		
		System.out.println("O dobro da área desse quadrado é " + dobro + " metros ao quadrado.");
	}

}
