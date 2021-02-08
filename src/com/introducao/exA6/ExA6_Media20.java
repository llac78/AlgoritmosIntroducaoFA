package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Media20 {

	public static void main(String[] args) {
		
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite um número: ");
			Scanner scNumero = new Scanner(System.in); 
			int numero = scNumero.nextInt();
			
			soma += numero;
			scNumero.close();
		}
		media = soma / 20;
		
		System.out.println("Média: " + media);
	}
}
