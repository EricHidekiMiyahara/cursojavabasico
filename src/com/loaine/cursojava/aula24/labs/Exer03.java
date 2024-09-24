package com.loaine.cursojava.aula24.labs;

public class Exer03 {
	
	public static void main (String[] args) {
		LivroDeLivraria livro = new LivroDeLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loaine Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Nome da autora: " + livro.autor);
		System.out.println("Ano de lançamento: " + livro.anoLancamento);
		System.out.println("Preço do livro R$: " + livro.preco + " reais.");
		
		
	}
}
