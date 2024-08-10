package com.loaine.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro lado do triângulo: ");
		double primeiroLado = scan.nextDouble();
		
		System.out.println("Entre com o segundo lado do triângulo: ");
		double segundoLado = scan.nextDouble();

		System.out.println("Entre com o terceiro lado do triângulo: ");
		double terceiroLado = scan.nextDouble();

		if (((primeiroLado + segundoLado) > terceiroLado) && 
				((segundoLado + terceiroLado) > primeiroLado) && 
				((terceiroLado + primeiroLado) > segundoLado)) {
			System.out.println("A soma dos três lados formam um triângulo.");
		}else {
			System.out.println("A soma dos três lados não formam um triângulo.");
		}
		
		if (primeiroLado == segundoLado && segundoLado == terceiroLado && terceiroLado == primeiroLado) {
			System.out.println("Triângulo equilátero.");
		}else if (primeiroLado == segundoLado && primeiroLado != terceiroLado || (segundoLado == terceiroLado && primeiroLado != segundoLado) || (terceiroLado == primeiroLado && segundoLado != terceiroLado)) {
			System.out.println("Triângulo isósceles.");
		}else if (primeiroLado != segundoLado && primeiroLado != terceiroLado) {
			System.out.println("Triângulo escaleno.");
		}
		
	}

}
