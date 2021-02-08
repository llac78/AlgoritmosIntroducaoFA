package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_AlunoResultado {

	public static void main(String[] args) {
		
		System.out.print("Digite o nome do aluno: ");
		Scanner scNome = new Scanner(System.in);
		String nome = scNome.nextLine();
		
		System.out.print("Digite a primeira nota do aluno: ");
		Scanner scN1 = new Scanner(System.in);
		float n1 = scN1.nextFloat();

		System.out.print("Digite a segunda nota do aluno: ");
		Scanner scN2 = new Scanner(System.in);
		float n2 = scN2.nextFloat();

		avaliarAluno(nome, n1, n2);
		scN1.close();
		scN2.close();
		scNome.close();
	}

	private static void avaliarAluno(String nome, float n1, float n2) {
		String resultado = "";
		
		float media = (n1 + n2)/2;

		if (media >= 7) {
			resultado = Constantes.APROVADO; 

		} else if (media < 3) {
			resultado = Constantes.REPROVADO;

		} else  {
			resultado = Constantes.PROVA_FINAL;
		}
		System.out.println("Aluno: " + nome + " | Nota 1: " + n1 + " | Nota 2: " + n2 + " | Média: " + media + " | Resultado: " + resultado + ".");
	}
}

