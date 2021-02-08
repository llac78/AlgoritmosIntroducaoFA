package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_ValorFracaoScomN {

	public static void main(String[] args) {

		int numerador = 0;
		int denominador = 0;
		float s = 0;
		String sTexto = "";

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();

		for (int i = 1; i <= tamanho; i++) {
			numerador = i;
			denominador = i + 1;
			sTexto += String.valueOf(numerador) + "/" + String.valueOf(denominador) + "+";
		}
		sTexto = sTexto.substring(0, sTexto.length() - 1);
		System.out.println(sTexto);
		
		String[] fracoes = sTexto.split("\\+");
		for (int i = 0; i < fracoes.length; i++) {
			s += calcularDivisao(fracoes[i]);
		}
		System.out.println("O valor de S é " + s);

		sc.close();
	}

	private static float calcularDivisao(String fracao) {
		float num;
		float den;
		float divisao;
		String[] fracoes = fracao.split("/");
		num = Float.valueOf(fracoes[0]);
		den = Float.valueOf(fracoes[1]);
		divisao = num / den;

		return divisao;
	}

}
