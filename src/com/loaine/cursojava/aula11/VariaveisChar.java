package com.loaine.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		// char o = 'o';
		
		// char i = 'i';
		
		char o = 111;
		char i = 105;
		char interrogacao = 0x00E1; // valor á
		
		System.out.println("" + o + i + interrogacao);
		System.out.println("O 1ª caractere foi o: " + o + " e o 2ª caractere foi o: " + i + ".");
		System.out.println(interrogacao);
		System.out.println("Faltou esse ponto de " + interrogacao);
	}

}
