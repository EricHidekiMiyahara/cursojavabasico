package com.loaine.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// convenção Java
		int idade = 21;
		String nome = "Eric";
		String nomeDoMeuCachorro = "Totó";
		String ano2014;
		
		// aceito, mas não utilizado
		int _idade;
		int $idade;
		
		// Nao e convencao Java
		String nome_do_meu_cachorro;
		String Nome_Do_Meu_Cachorro;
		String nome_Do_meu_cachorro;
		String NomeDoMeuCachorro;
		
		idade = 24;
		System.out.println("A idade do " + nome + " é de " + idade + " anos.");
		System.out.println(nome);
		
		// má prática
		int a = 19;
		String b = "Loaine";
	}

}
