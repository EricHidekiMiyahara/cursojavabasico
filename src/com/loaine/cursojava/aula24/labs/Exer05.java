package com.loaine.cursojava.aula24.labs;

public class Exer05 {
	
	public static void main (String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.saldo = -10;
		conta.especial = true;
		conta.limiteEspecial = 500;
		
		System.out.println("Número da conta: " + conta.numero);
		System.out.println("Número da agência: " + conta.agencia);
		System.out.println("Saldo da conta R$: " + conta.saldo + " reais.");
		System.out.println("É conta especial: " + conta.especial);
		System.out.println("Limite especial da conta: " + conta.limiteEspecial);
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
	}
}
