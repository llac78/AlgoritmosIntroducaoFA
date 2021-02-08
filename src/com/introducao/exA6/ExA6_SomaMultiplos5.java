package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_SomaMultiplos5 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		System.out.print("Digite um número: ");
		Scanner scNumero = new Scanner(System.in); 
		int numero = scNumero.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if(i % 5 == 0) {
				soma += i;
			}
		}
		
		System.out.println("Soma dos múltiplos de 5: " + soma);
		scNumero.close();
	}
}
