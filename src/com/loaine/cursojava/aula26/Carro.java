package com.loaine.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	double capCombustivel;
	double consumoCombustivel;
	int numPassageiros;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
}
