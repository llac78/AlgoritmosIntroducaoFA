package com.introducao.exA7;

import java.util.Scanner;

public class ExA7_VetorInteiros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int opcaoMenuPrincipal = 0;

		int counter = 0;
		int[] numeros = new int[10];
		int vazio = 0;
		boolean maior = false;
		boolean menor = false;
		boolean antesDepoisOK = false;
		boolean vetorCompleto = false;
		int aux = 0;

		while (opcaoMenuPrincipal != 5) {
			abrirMenuPrincipal();
			opcaoMenuPrincipal = digitarOpcaoMenu();

			if (opcaoMenuPrincipal == 5) {
				System.out.println("Saindo...");
				break;
			}

			switch (opcaoMenuPrincipal) {
			case 1: // Adicionar elementos ao vetor
				do {
					System.out.print("Digite um número: ");
					Scanner scNum = new Scanner(System.in);
					int num = scNum.nextInt();

					if (vetorCompleto) {
						System.out.println("Não é mais possível inserir elementos.".toUpperCase());
						break;
					}

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
									System.out.println(
											"Valor não permitido, pois há valores menores em uma posição posterior."
													.toUpperCase());
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
									System.out.println(
											"Valor não permitido, pois há valores maiores em alguma posição anterior."
													.toUpperCase());
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
								for (int i = 0; i < pos; i++) { // verificar se o número informado é menor que os das
																// posições anteriores
									if (numeros[i] > 0) {
										if (num < numeros[i]) {
											menor = true;
										}
									}
								}
								for (int i = pos + 1; i < numeros.length; i++) { // verificar se o número informado é
																					// maior que os das posições
																					// posteriores
									if (numeros[i] > 0) {
										if (num > numeros[i]) {
											maior = true;
										}
									}
								}
								if (menor || maior) {
									if (menor) {
										System.out.println(
												"Valor não permitido, pois há valores maiores em uma posição anterior."
														.toUpperCase());
									} else {
										System.out.println(
												"Valor não permitido, pois há valores menores em uma posição posterior."
														.toUpperCase());
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
						vetorCompleto = true;
					}
				} while (counter <= numeros.length);

				System.out.println("**********************************");

				if (vetorCompleto) {
					System.out.println("Voltando ao menu...");
					break;
				}
				break;
				
			case 2: // Excluir elementos do vetor

				boolean estaNoVetor = false;
				int qtdNumerosExcluidos = 0;
				
				while(qtdNumerosExcluidos  != numeros.length) {
					
					System.out.print("Informe o número que deseja excluir: ");
					Scanner sc = new Scanner(System.in);
					int num = sc.nextInt();
					
					for (int i = 0; i < numeros.length; i++) {
						if(num == numeros[i]) {
							estaNoVetor = true;
						}
					}
					if(!estaNoVetor) {
						System.out.println("Este número não está presente no vetor.".toUpperCase());
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
						System.out.println("Voltando ao menu...");
					}
				}
				System.out.println("**********************************");
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(String.valueOf(numeros[i]) + " ");
				}
				System.out.println("");
				System.out.println("Não há mais números para excluir".toUpperCase());
				
				break;

			case 3: // Vetor em ordem crescente
				
				// ordenar o array
				for (int i = 1; i < numeros.length; i++) {
					for (int j = 0; j < i; j++) {
						if (numeros[i] < numeros[j]) {
							aux = numeros[i];
							numeros[i] = numeros[j];
							numeros[j] = aux;
						}
					}
				}
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				aux = 0;
				System.out.println("");
				break;

			case 4: // Vetor em ordem decrescente
				
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				System.out.println("");
				System.out.println("*******************************");
				
				// ordena o array
				for (int i = 1; i < numeros.length; i++) {
					for (int j = 0; j < i; j++) {
						if (numeros[i] > numeros[j]) {
							aux = numeros[j];
							numeros[j] = numeros[i];
							numeros[i] = aux;
						}
					}
				}
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				aux = 0;
				System.out.println("");
				break;

			case 5: // Sair
				System.out.println("Encerrando...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
		System.out.println("Programa encerrado.");
	}

	static void abrirMenuPrincipal() {
		System.out.println("##############################################");
		System.out.println("1. Adicionar elementos ao vetor");
		System.out.println("2. Excluir elementos do vetor");
		System.out.println("3. Vetor em ordem crescente");
		System.out.println("4. Vetor em ordem decrescente");
		System.out.println("5. Sair");
		System.out.println("##############################################");
	}

	@SuppressWarnings("resource")
	static int digitarOpcaoMenu() {
		Scanner sc = new Scanner(System.in);
		int opcaoMenuPrincipal = sc.nextInt();

		return opcaoMenuPrincipal;
	}

}
