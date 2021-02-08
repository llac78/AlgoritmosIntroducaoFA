package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Maior30 {

	public static void main(String[] args) {
		
		int[] numeros = new int[30];
		int counter = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			Scanner scNome = new Scanner(System.in); 
			numeros[i] = scNome.nextInt();
			
			if(numeros[i] > 30) {
				counter++;
			}
			scNome.close();
		}
		System.out.println("Quantidade de números maiores que 30: " + counter);
	}
}
