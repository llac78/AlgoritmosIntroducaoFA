package com.introducao.exA4;

import java.util.Scanner;

public class ExA4_SomaDigitos {

	public static void main(String[] args) {

		int numero = 0;
		int numeroValido = 0;
		
		do {
			System.out.print("Digite um número: ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			if(numero < 1000) {
				numeroValido = numero;
				break;
			} else {
				System.out.print("Valor inválido!");
			}
			sc.close();
		} while(numero < 1000);
		
		System.out.println("A soma dos dígitos é " + somarDigitos(numeroValido));
	}

	private static int somarDigitos(int numeroValido) {
		int soma = 0;
		String numero = String.valueOf(numeroValido);
		int qtdDigitos = numero.length();
		
		for (int i = 0; i < qtdDigitos; i++) {
			int n = Integer.valueOf(numero.substring(i, i + 1));
			soma += n;
		}
		
		return soma;
	}

}
