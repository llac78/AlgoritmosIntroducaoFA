package com.introducao.exA7;

import java.util.Scanner;

public class ExA7_MenuPessoas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int opcaoMenuPrincipal = 0;

		while (opcaoMenuPrincipal != 2) {
			abrirMenuPrincipal();
			opcaoMenuPrincipal = digitarOpcaoMenu();

			if (opcaoMenuPrincipal == 2) {
				System.out.println("Saindo...");
				break;
			} else if (opcaoMenuPrincipal == 1) {
				int opcaoMenu = 0;
				int tamanho = 10;
				int idadeMenor = 999;
				int homemMaisIdoso = 0;
				String pessoaMaisNova = "";
				String[] nomes = new String[tamanho];
				int[] idades = new int[tamanho];
				String[] sexos = new String[tamanho];

				for (int i = 0; i < tamanho; i++) {
					System.out.print("Digite o nome: ");
					Scanner scNome = new Scanner(System.in);
					String nome = scNome.nextLine();

					System.out.print("Digite a idade: ");
					Scanner scIdade = new Scanner(System.in);
					int idade = scIdade.nextInt();

					System.out.print("Digite o sexo: ");
					Scanner scSexo = new Scanner(System.in);
					String sexo = scSexo.nextLine().toUpperCase();

					nomes[i] = nome;
					idades[i] = idade;
					sexos[i] = sexo;
				}
				
				while (opcaoMenu != 4) {
					abrirMenuPessoas();
					opcaoMenu = digitarOpcaoMenu();
					switch (opcaoMenu) {
					case 1: // Consultar o nome da pessoa mais nova
						for (int i = 0; i < tamanho; i++) {
							if(idades[i] < idadeMenor) {
								idadeMenor = idades[i];
								pessoaMaisNova = nomes[i];
							}
						}
						System.out.println("A pessoa mais nova é " + pessoaMaisNova + ".");
						break;
					case 2: // Consultar a idade do homem mais idoso
						for (int i = 0; i < tamanho; i++) {
							if(sexos[i].equals("M")) {
								if(idades[i] > homemMaisIdoso) {
									homemMaisIdoso = idades[i];
								}
							}
						}
						System.out.println("O homem mais idoso possui " + homemMaisIdoso + " anos.");
						break;

					case 3:
						int counter = 0;
						int somaIdadesF = 0;
						int media = 0;
						for (int i = 0; i < tamanho; i++) {
							if(sexos[i].equals("F")) {
								somaIdadesF += idades[i];
								counter++;
							}
						}
						media = somaIdadesF/counter;
						System.out.println("A média das idades das mulheres é de " + media + " anos.");
						break;

					case 4: // Sair
						break;

					default:
						break;
					}
					if (opcaoMenu == 4) {
						System.out.println("Voltando ao menu principal...");
						break;
					}
				}
			}
		}
		System.out.println("Programa encerrado.");
	}

	static void abrirMenuPrincipal() {
		System.out.println("##############################################");
		System.out.println("1. Informar os dados das pessoas");
		System.out.println("2. Sair");
		System.out.println("##############################################");
	}

	static void abrirMenuPessoas() {
		System.out.println("##############################################");
		System.out.println("1. Consultar o nome da pessoa mais nova");
		System.out.println("2. Consultar a idade do homem mais idoso");
		System.out.println("3. Consultar a média das idades das mulheres");
		System.out.println("4. Sair");
		System.out.println("##############################################");
	}

	@SuppressWarnings("resource")
	static int digitarOpcaoMenu() {
		Scanner sc = new Scanner(System.in);
		int opcaoMenuPrincipal = sc.nextInt();

		return opcaoMenuPrincipal;
	}

}
