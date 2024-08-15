package com.loaine.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][][] compromisso = new String[12][31][8];

		boolean sair = false;
		byte opcao;

		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso:");
			System.out.println("Digite 2 para verificar compromisso:");
			System.out.println("Digite 0 para sair:");
			opcao = scan.nextByte();

			if (opcao == 1) {

				int mes = 0;
				boolean mesValido = false;

				while (!mesValido) {
					System.out.println("Entre com o mês do compromisso:");
					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, tente novamente.");
					}
				}

				int dia = 0;
				boolean diaValido = false;

				while (!diaValido) {
					System.out.println("Entre com o dia do compromisso:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, tente novamente.");
					}
				}

				int hora = 0;
				boolean horaValida = false;

				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();

					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, tente novamente.");
					}
				}

				mes--;
				dia--;
				System.out.println("Digite o compromisso:");
				compromisso[mes][dia][hora] = scan.next();

			} else if (opcao == 2) {

				int mes = 0;
				boolean mesValido = false;

				while (!mesValido) {
					System.out.println("Entre com o mês:");
					mes = scan.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, tente novamente.");
					}
				}

				int dia = 0;
				boolean diaValido = false;

				while (!diaValido) {
					System.out.println("Entre com o dia:");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, tente novamente.");
					}
				}

				int hora = 0;
				boolean horaValida = false;

				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();

					if (hora > 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, tente novamente.");
					}
				}

				mes--;
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromisso[mes][dia][hora]);

			} else if (opcao == 0) {
				sair = true;

			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
		}

	}
}
