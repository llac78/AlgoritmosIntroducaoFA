package com.introducao.exA8;

import java.util.Scanner;

public class ExA8_Matrizes {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.print("Digite a ordem das matrizes A e B: ");
		Scanner scOrdemMatrizes = new Scanner(System.in);
		int ordemMatrizes = scOrdemMatrizes.nextInt();

		if (ordemMatrizes < 0 || ordemMatrizes > 10) {
			System.out.println("A ordem máxima das matrizes é 10x10. Tente novamente.");

		} else {
			int opcaoMenu = 0;
			int[][] matrizA = new int[ordemMatrizes][ordemMatrizes];
			int[][] matrizB = new int[ordemMatrizes][ordemMatrizes];
			
			if (matrizA[0].length != matrizB.length) throw new RuntimeException("Dimensões inconsistentes. Impossível multiplicar as matrizes");

			System.out.println("Digite os elementos da Matriz A: ");
			Scanner scA = new Scanner(System.in);

			for (int i = 0; i < ordemMatrizes; i++) {
				for (int j = 0; j < ordemMatrizes; j++) {
					matrizA[i][j] = scA.nextInt();
				}
			}
			System.out.println("Digite os elementos da Matriz B: ");
			Scanner scB = new Scanner(System.in);

			for (int i = 0; i < ordemMatrizes; i++) {
				for (int j = 0; j < ordemMatrizes; j++) {
					matrizB[i][j] = scB.nextInt();
				}
			}

			do {
				abrirMenuPrincipal();
				Scanner scOpcao = new Scanner(System.in);
				opcaoMenu = scOpcao.nextInt();
				if (opcaoMenu < 0 || opcaoMenu > 10) {
					System.out.println("Opção inválida. Tente novamente.");
				} else {
					switch (opcaoMenu) {
					case 1:
						for (int i = 0; i < matrizA.length; i++) {
							for (int j = 0; j < matrizA.length; j++) {
								System.out.print(matrizA[i][j] + " ");
							}
							System.out.println("");
						}
						System.out.println("--------------------------");
						for (int i = 0; i < matrizB.length; i++) {
							for (int j = 0; j < matrizB.length; j++) {
								System.out.print(matrizB[i][j] + " ");
							}
							System.out.println("");
						}
						System.out.println("Voltando ao menu principal...");
						break;

					case 2:
						int[][] matrizResultante = new int[ordemMatrizes][ordemMatrizes];

						for (int i = 0; i < matrizA.length; i++) {
					        for (int j = 0; j < matrizB.length; j++) {
					            for (int k = 0; k < matrizA.length; k++) {
					            	matrizResultante[i][j] += matrizA[i][k] * matrizB[k][j]; 
					            }
					        }
					    }
						for (int i = 0; i < matrizResultante.length; i++) {
							for (int j = 0; j < matrizResultante.length; j++) {
								System.out.print(matrizResultante[i][j] + " ");
							}
							System.out.println("");
						}
						break;

					default:
						break;
					}
				}
			} while (opcaoMenu != 3);
			System.out.println("Saindo...");

		}
		System.out.println("Programa encerrado.");

	}

	static void abrirMenuPrincipal() {
		System.out.println("##############################################");
		System.out.println("1. Exibir as duas matrizes");
		System.out.println("2. Multiplicar as matrizes");
		System.out.println("3. Sair");
		System.out.println("##############################################");
	}

	@SuppressWarnings("resource")
	static int digitarOpcaoMenu() {
		Scanner sc = new Scanner(System.in);
		int opcaoMenuPrincipal = sc.nextInt();

		return opcaoMenuPrincipal;
	}

}
