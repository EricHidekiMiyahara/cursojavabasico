package com.loaine.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Contador: " + i);
		}
		
		// System.out.println(i); erro
		for (int i = 5; i > 0; i--) {
			System.out.println("Contador: " + i);
		}
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("Valor de i: " + i + ". Valor de j: " + j);
		}
		
		int count = 0;
		for ( ; count < 10 ; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println(cont);
		}
		
		int soma = 0;
		
		for (int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma é de: " + soma);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i tem o valor de : " + i);
			System.out.println("i tem o valor de: ");
		}
	}

}
