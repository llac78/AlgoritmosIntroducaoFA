package com.introducao.exA9;

import java.util.Scanner;

public class ExA9_Modularizacao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int opcaoMenu = 0;
		double qtdElementos = 0;
		double[] elementos = null;
		double[] listaElementos = null;

		do {
			abrirMenuPrincipal();
			Scanner scOpcao = new Scanner(System.in);
			opcaoMenu = scOpcao.nextInt();
			if (opcaoMenu < 0 || opcaoMenu > 3) {
				System.out.println("Opção inválida. Tente novamente.");
			} else {
				switch (opcaoMenu) {
				case 1:
					System.out.print("Digite a quantidade de elementos do grupo: ");
					Scanner scQtdElementos = new Scanner(System.in);
					qtdElementos = scQtdElementos.nextDouble();
					
					listaElementos = new double[(int) qtdElementos];
					
					System.out.print("Informe os elementos do grupo: ");
					for (int i = 0; i < listaElementos.length; i++) {
						Scanner scElemento = new Scanner(System.in);
						listaElementos[i] = scElemento.nextDouble();
					}

					System.out.println("Voltando ao menu principal...");
					break;

				case 2:
					double somaQuadrados = somaQuadrados(elementos);
					double quadradoSoma = quadradoSoma(elementos);
					
					System.out.println(somaQuadrados + " --- " + quadradoSoma);
					System.out.println("O desvio padrão é " + calcularDesvioPadrao(somaQuadrados, quadradoSoma, qtdElementos));
					
					break;

				default:
					break;
				}
				elementos = listaElementos;
			}
		} while (opcaoMenu != 3);
		System.out.println("Saindo...");

		System.out.println("Programa encerrado.");

	}

	static void abrirMenuPrincipal() {
		System.out.println("##############################################");
		System.out.println("1. Informar a quantidade e os valores dos elementos do grupo");
		System.out.println("2. Calcular o desvio padrão do grupo");
		System.out.println("3. Sair");
		System.out.println("##############################################");
	}

	@SuppressWarnings("resource")
	static int digitarOpcaoMenu() {
		Scanner sc = new Scanner(System.in);
		int opcaoMenuPrincipal = sc.nextInt();

		return opcaoMenuPrincipal;
	}
	
	static double somaQuadrados(double[] elementos) {
		double somaQuadrados = 0;
		for (int i = 0; i < elementos.length; i++) {
			somaQuadrados += Math.pow(elementos[i], 2);
		}
		return somaQuadrados;
	}
	
	static double quadradoSoma(double[] elementos) {
		double quadradoSoma = 0;
		for (int i = 0; i < elementos.length; i++) {
			quadradoSoma += elementos[i];
		}
		quadradoSoma = Math.pow(quadradoSoma, 2);
		return quadradoSoma;
	}
	
	static double calcularDesvioPadrao(double somaQuadrados, double quadradoSoma, double qtdElementos) {
		double desvioPadrao = 0;
		
		desvioPadrao = Math.sqrt( somaQuadrados - ( Math.pow(quadradoSoma, 2)/qtdElementos)  / (qtdElementos - 1) );
		
		return desvioPadrao;
	}

}
