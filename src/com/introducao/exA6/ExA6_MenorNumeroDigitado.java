package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_MenorNumeroDigitado {

	public static void main(String[] args) {
		
		int maior = 0;
		
		System.out.print("Digite a quantidade de números a serem lidos: ");
		Scanner sc = new Scanner(System.in);
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite um número: ");
			Scanner n = new Scanner(System.in);
			int num = n.nextInt();
			
			if(num > maior) {
				maior = num;
			}
			n.close();
		}
		System.out.println("O maior número digitado foi " + maior + ".");
		sc.close();
	}
}
