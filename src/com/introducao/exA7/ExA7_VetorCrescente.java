package com.introducao.exA7;

import java.util.Scanner;

public class ExA7_VetorCrescente {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int[] numeros = new int[10];
		int aux = 0;

		// adiciona desordenado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			Scanner scNum = new Scanner(System.in);
			int numero = scNum.nextInt();

			numeros[i] = numero;
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("*******************************");
		
		// ordena o array
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
	}
}
