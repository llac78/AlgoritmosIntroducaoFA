package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_ValorFracaoXcomN {

	public static void main(String[] args) {

		int numerador = 0;
		int denominador = 0;
		float s = 0;
		String sTexto = "";

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		numerador = n + 1;
		for (int i = 1; i <= n; i++) {
			denominador = i;
			sTexto += String.valueOf(numerador - 1) + "/" + String.valueOf(denominador) + "+";
			numerador--;
		}
		sTexto = sTexto.substring(0, sTexto.length() - 1);
		System.out.println(sTexto);

		String[] fracoes = sTexto.split("\\+");
		for (int i = 0; i < fracoes.length; i++) {
			System.out.println(fracoes[i]);
		}
		System.out.println("----------");

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
