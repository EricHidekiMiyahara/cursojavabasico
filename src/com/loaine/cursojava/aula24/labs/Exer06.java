package com.loaine.cursojava.aula24.labs;

public class Exer06 {
	
	public static void main (String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "João";
		contato1.email = "joao@gmail.com";
		contato1.endereco = "Av paulista, 1000";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";
		
		System.out.println("Nome do contato: " + contato1.nome);
		System.out.println("E-mail do contato: " + contato1.email);
		System.out.println("Endereço do contato: " + contato1.endereco);
		System.out.println("1ª telefone do contato: " + contato1.telefones[0]);
		System.out.println("2ª telefone do contato: " + contato1.telefones[1]);
	}
}
