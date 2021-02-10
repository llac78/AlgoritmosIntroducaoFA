package com.introducao.exA7;

import java.util.Scanner;

public class ExA7_VetorInteiros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int counter = 0;
		int[] numeros = new int[10];
		int vazio = 0;
		boolean maior = false;
		boolean menor = false;
		boolean antesDepoisOK = false;

		while (counter < numeros.length) {
			System.out.print("Digite um número: ");
			Scanner scNum = new Scanner(System.in);
			int num = scNum.nextInt();

			System.out.print("Digite a posição desejada: ");
			Scanner scPos = new Scanner(System.in);
			int pos = scPos.nextInt();
			if (pos < 0 || pos > numeros.length) {
				System.out.println("Posição inexistente.".toUpperCase());
			} else if (pos == 0) {
				if (numeros[0] == 0) {
					for (int i = 0; i < numeros.length; i++) { // verifica se há espaços vazios no array
						if (numeros[i] == 0) {
							vazio++;
						}
					}
					if (vazio > 0 && vazio == numeros.length) { // confirma se o array está totalmente vazio
						numeros[0] = num;
						counter++;
					} else if (vazio > 0) {
						for (int i = 1; i < numeros.length; i++) {
							if (numeros[i] > 0) {
								if (num > numeros[i]) {
									maior = true;
								}
							}
						}
						if (maior) {
							System.out.println("Valor não permitido, pois há valores menores em uma posição posterior.".toUpperCase());
						} else {
							numeros[0] = num;
							counter++;
						}
					}
				} else {
					System.out.println("Primeira posição indisponível, pois já está ocupada.".toUpperCase());
				}
				System.out.println("Quantidade de elementos no vetor: " + counter);
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				System.out.println("");
			} else if (pos == 9) {
				if (numeros[9] == 0) {
					for (int i = 0; i < numeros.length; i++) {
						if (numeros[i] == 0) {
							vazio++;
						}
					}
					if (vazio > 0 && vazio == numeros.length) {
						numeros[9] = num;
						counter++;
					} else {
						for (int i = 0; i < numeros.length - 1; i++) {
							if (num < numeros[i]) {
								menor = true;
							}
						}
						if (menor) {
							System.out.println("Valor não permitido, pois há valores maiores em alguma posição anterior.".toUpperCase());
						} else {
							numeros[9] = num;
							counter++;
						}
					}
				} else {
					System.out.println("Última posição indisponível.".toUpperCase());
				}
				System.out.println("Quantidade de elementos no vetor: " + counter);
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				System.out.println("");
			} else {
				if (numeros[pos] == 0) {
					for (int i = 0; i < numeros.length; i++) {
						if (numeros[i] == 0) {
							vazio++;
						}
					}
					if (vazio > 0 && vazio == numeros.length) {
						numeros[pos] = num;
						counter++;
					} else {
						for (int i = 0; i < pos; i++) { // verificar se o número informado é menor que os das posições anteriores
							if (numeros[i] > 0) {
								if (num < numeros[i]) {
									menor = true;
								}
							}
						}
						for (int i = pos + 1; i < numeros.length; i++) { // verificar se o número informado é maior que os das posições posteriores
							if (numeros[i] > 0) {
								if (num > numeros[i]) {
									maior = true;
								}
							}
						}
						if (menor || maior) {
							if (menor) {
								System.out.println("Valor não permitido, pois há valores maiores em uma posição anterior.".toUpperCase());
							} else {
								System.out.println("Valor não permitido, pois há valores menores em uma posição posterior.".toUpperCase());
							}
						} else {
							if ((num > numeros[pos - 1]) && (num < numeros[pos + 1] || numeros[pos + 1] == 0)) {
								antesDepoisOK = true;
							}
						}

						if (antesDepoisOK) {
							numeros[pos] = num;
							counter++;
						}
					}
					System.out.println("Quantidade de elementos no vetor: " + counter);
					for (int i = 0; i < numeros.length; i++) {
						System.out.print(numeros[i] + " ");
					}
					System.out.println("");
				} else {
					System.out.println("Esta posição está indisponível. Tente novamente.".toUpperCase());
				}
			}
			vazio = 0;
			menor = false;
			maior = false;
			antesDepoisOK = false;
			if (counter == numeros.length) {
				System.out.println("Saindo..");
				break;
			}
		}
		System.out.println("Programa encerrado.");

		// adiciona desordenado
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.print("Digite um número: ");
//			Scanner scNum = new Scanner(System.in);
//			int numero = scNum.nextInt();
//
//			numeros[i] = numero;
//
//			counter++;
//			System.out.println("Quantidade de elementos no vetor: " + counter);
//		}

		// ordena o array
//		for (int i = 1; i < numeros.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (numeros[i] < numeros[j]) {
//					aux = numeros[i];
//					numeros[i] = numeros[j];
//					numeros[j] = aux;
//				}
//			}
//		}
	}

}
