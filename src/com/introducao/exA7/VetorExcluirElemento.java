package com.introducao.exA7;

import java.util.Scanner;

public class VetorExcluirElemento {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int counter = 0;
		int[] numeros = new int[10];
		int vazio = 0;
		boolean maior = false;
		boolean menor = false;
		boolean antesDepoisOK = false;
		int qtdNumerosExcluidos = 0;

		while (counter < numeros.length) {
			System.out.print("Digite um n�mero: ");
			Scanner scNum = new Scanner(System.in);
			int num = scNum.nextInt();

			System.out.print("Digite a posi��o desejada: ");
			Scanner scPos = new Scanner(System.in);
			int pos = scPos.nextInt();
			if (pos < 0 || pos > numeros.length) {
				System.out.println("Posi��o inexistente.".toUpperCase());
			} else if (pos == 0) {
				if (numeros[0] == 0) {
					for (int i = 0; i < numeros.length; i++) { // verifica se h� espa�os vazios no array
						if (numeros[i] == 0) {
							vazio++;
						}
					}
					if (vazio > 0 && vazio == numeros.length) { // confirma se o array est� totalmente vazio
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
							System.out.println("Valor n�o permitido, pois h� valores menores em uma posi��o posterior.".toUpperCase());
						} else {
							numeros[0] = num;
							counter++;
						}
					}
				} else {
					System.out.println("Primeira posi��o indispon�vel, pois j� est� ocupada.".toUpperCase());
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
							System.out.println("Valor n�o permitido, pois h� valores maiores em alguma posi��o anterior.".toUpperCase());
						} else {
							numeros[9] = num;
							counter++;
						}
					}
				} else {
					System.out.println("�ltima posi��o indispon�vel.".toUpperCase());
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
						for (int i = 0; i < pos; i++) { // verificar se o n�mero informado � menor que os das posi��es anteriores
							if (numeros[i] > 0) {
								if (num < numeros[i]) {
									menor = true;
								}
							}
						}
						for (int i = pos + 1; i < numeros.length; i++) { // verificar se o n�mero informado � maior que os das posi��es posteriores
							if (numeros[i] > 0) {
								if (num > numeros[i]) {
									maior = true;
								}
							}
						}
						if (menor || maior) {
							if (menor) {
								System.out.println("Valor n�o permitido, pois h� valores maiores em uma posi��o anterior.".toUpperCase());
							} else {
								System.out.println("Valor n�o permitido, pois h� valores menores em uma posi��o posterior.".toUpperCase());
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
					System.out.println("Esta posi��o est� indispon�vel. Tente novamente.".toUpperCase());
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
		
		System.out.println("**********************************");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
		System.out.println("**********************************");
		
		boolean estaNoVetor = false;
		
		while(qtdNumerosExcluidos != numeros.length) {
			
			System.out.print("Informe o n�mero que deseja excluir: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			for (int i = 0; i < numeros.length; i++) {
				if(num == numeros[i]) {
					estaNoVetor = true;
				}
			}
			if(!estaNoVetor) {
				System.out.println("Este n�mero n�o est� presente no vetor.".toUpperCase());
			} else {
				for (int i = 0; i < numeros.length; i++) {
					if(num == numeros[i]) {
						for (int j = i; j < numeros.length - 1; j++) {
							numeros[j] = numeros[j + 1];
							numeros[j + 1] = 0;
						}
					}
				}
				qtdNumerosExcluidos++;
			}
			estaNoVetor = false;
			System.out.println("");
			if(qtdNumerosExcluidos == numeros.length) {
				System.out.println("Saindo");
			}
		}
		System.out.println("**********************************");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(String.valueOf(numeros[i]) + " ");
		}
		System.out.println("");
		System.out.println("N�o h� mais n�meros para excluir".toUpperCase());
		System.out.println("Programa encerrado.");

	}

}
