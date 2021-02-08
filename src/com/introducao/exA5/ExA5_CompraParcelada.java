package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_CompraParcelada {

	public static void main(String[] args) {

		System.out.print("Digite o valor do produto: ");
		Scanner scValor = new Scanner(System.in);
		double valor = scValor.nextDouble();

		System.out.print("Digite a quantidade de parcelas: ");
		Scanner scParcelas = new Scanner(System.in);
		int qtdParcelas = scParcelas.nextInt();

		System.out.println("Valor a per pago: R$ " + String.format("%.2f", calcularValorFinal(valor, qtdParcelas)));
		scParcelas.close();
		scValor.close();
	}

	private static double calcularValorFinal(double valor, int qtdParcelas) {
		double valorFinal = 0;

		if (qtdParcelas == 1) {
			valorFinal = valor;
			
		} else if (qtdParcelas == 2) {
			valorFinal = valor * 1.1;
			
		} else if (qtdParcelas == 3) {
			valorFinal = valor * 1.2;
		} 
		return valorFinal;
	}

}
