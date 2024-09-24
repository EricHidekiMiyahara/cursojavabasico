package com.loaine.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {
	
	public static void main (String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loaine Groner";
		livro.anoLancamento = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Loiane";
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Nome da autora: " + livro.autor);
		System.out.println("Ano de lançamento: " + livro.anoLancamento);
		System.out.println(livro.emprestado);
		System.out.println("Data de entrega do livro: " + livro.dataEntrega);
		System.out.println("Livro emprestado a " + livro.emprestadoA);
	}
}
