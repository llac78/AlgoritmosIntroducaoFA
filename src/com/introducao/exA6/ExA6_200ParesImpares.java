package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_200ParesImpares {

	public static void main(String[] args) {
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			Scanner scNumero = new Scanner(System.in); 
			int numero = scNumero.nextInt();
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			scNumero.close();
		}
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de ímpares: " + impares);
	}
}
