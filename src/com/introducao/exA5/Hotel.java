package com.introducao.exA5;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		
		double valorUnitarioDiaria = 0;
		double totalDiarias = 0;
		double subTotal = 0;
		double taxaServico = 0;
		double totalGeral = 0;

		System.out.print("Digite o nome do hóspede: ");
		Scanner scNome = new Scanner(System.in);
		String nome = scNome.nextLine();
		
		System.out.print("Digite o tipo de quarto utilizado: ");
		Scanner scApto = new Scanner(System.in);
		char tipoApto = scApto.next().charAt(0);
		
		System.out.print("Digite a quantidade de diárias: ");
		Scanner scDiarias = new Scanner(System.in);
		int qtdDiarias = scDiarias.nextInt();
		
		System.out.print("Digite o valor do consumo interno: ");
		Scanner scConsumo = new Scanner(System.in);
		double consumo = scConsumo.nextDouble();
		
		valorUnitarioDiaria = getValorUnitarioDiaria(tipoApto);
		totalDiarias = calcularDiarias(tipoApto, qtdDiarias);
		subTotal = calcularSubtotal(totalDiarias, consumo);
		taxaServico = calcularTaxaServico(subTotal);
		totalGeral = calcularTotalGeral(subTotal, taxaServico);
		
		System.out.println("Nome do Hóspede: " + nome);
		System.out.println("Tipo do apartamento: " + tipoApto);
		System.out.println("Quantidade de diárias: " + qtdDiarias + " | Valor unitário da diária: R$ " + String.format("%.2f", valorUnitarioDiaria) + 
				" | Valor total das diárias: R$ " + String.format("%.2f", totalDiarias));
		System.out.println("Valor do consumo interno: R$ " + String.format("%.2f", consumo));
		System.out.println("Subtotal: R$ " + String.format("%.2f", subTotal) + " | Taxa de serviço: R$ " + String.format("%.2f", taxaServico) + 
				" | Total geral: R$ " + String.format("%.2f", totalGeral));
		
		scApto.close();
		scConsumo.close();
		scDiarias.close();
		scNome.close();
	}
	
	private static double getValorUnitarioDiaria(char tipoApto) {
		double valorUnitarioDiaria = 0;
		
		if(tipoApto == 'A') {
			valorUnitarioDiaria = 150;
		} else if (tipoApto == 'B') {
			valorUnitarioDiaria = 100;
		} else if (tipoApto == 'C') {
			valorUnitarioDiaria = 75;
		} else if (tipoApto == 'D') {
			valorUnitarioDiaria = 150;
		}
		return valorUnitarioDiaria;
	}

	private static double calcularTotalGeral(double subTotal, double taxaServico) {
		return subTotal + taxaServico;
	}

	private static double calcularTaxaServico(double subTotal) {
		return subTotal * 0.1;
	}

	private static double calcularSubtotal(double totalDiarias, double consumo) {
		return totalDiarias + consumo;
	}

	private static double calcularDiarias(char tipoApto, int qtdDiarias) {
		double totalDiarias = 0;
		
		if(tipoApto == 'A') {
			totalDiarias = getValorUnitarioDiaria(tipoApto) * qtdDiarias;
		} else if (tipoApto == 'B') {
			totalDiarias = getValorUnitarioDiaria(tipoApto) * qtdDiarias;
		} else if (tipoApto == 'C') {
			totalDiarias = getValorUnitarioDiaria(tipoApto) * qtdDiarias;
		} else if (tipoApto == 'D') {
			totalDiarias = getValorUnitarioDiaria(tipoApto) * qtdDiarias;
		}
		return totalDiarias;
	}
}
