package com.introducao.exA6;

public class ExA6_ValorFracaoS {

	public static void main(String[] args) {

		int tamanho = 50;
		int numerador = -1;
		int denominador = 0;
		float s = 0;
		String sTexto = "";
		String subtracao = "-";
		String adicao = "+";
		float res1 = 0;
		float res2 = 0;
		float res3 = 0;
		
		for (int i = 1; i <= tamanho; i++) {
			numerador += 2;
			denominador += 1;
			if( (numerador == 1 && denominador == 1 ) || (numerador == 97 && denominador == 49 ) ){
				sTexto += String.valueOf(numerador)+ "/" + String.valueOf(denominador) + subtracao;
			} else {
				sTexto += String.valueOf(numerador)+ "/" + String.valueOf(denominador) + adicao;
			}
		}
		
		sTexto = sTexto.substring(0, sTexto.length()-1);

		String [] expressao = sTexto.split("-");
		for (int i = 0; i < expressao.length; i++) {
			System.out.println(expressao[i]);
		}
		System.out.println();
		
		String[] fracoes2 = expressao[1].split("\\+");
		for (int i = 0; i < fracoes2.length; i++) {
			System.out.println(fracoes2[i]);
		}
		System.out.println("----------");

		res1 = calcularDivisao(expressao[0]);
		for (int i = 0; i < fracoes2.length; i++) {
			res2 += calcularDivisao(fracoes2[i]);
		}
		res3 = calcularDivisao(expressao[2]);
		
		s = res1 - res2 - res3;
		System.out.println( res1 + " " + res2 + " " + res3);
		System.out.println("O valor de S é " + s);
	}

	private static float calcularDivisao(String fracao) {
		float num;
		float den;
		float divisao;
		String[] fracoes = fracao.split("/");
		num = Float.valueOf(fracoes[0]);
		den = Float.valueOf(fracoes[1]);
		divisao =  num / den;

		return divisao;
	}

}
