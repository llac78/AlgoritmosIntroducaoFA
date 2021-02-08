package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Sorteio {

	public static void main(String[] args) {
		
		double menor = 999999;
		double maior = 0;
		double media = 0;
		double soma = 0;
		
		System.out.print("Digite a quantidade de números a serem informados: ");
		Scanner sc = new Scanner(System.in);
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite um número: ");
			Scanner n = new Scanner(System.in);
			double num = n.nextDouble();
			
			if(num < menor) {
				menor = num;
			}
			if(num > maior) {
				maior = num;
			}
			soma += num;
			n.close();
		}
		media = soma/qtd;
		System.out.println("O menor número digitado foi " + menor + ".");
		System.out.println("O maior número digitado foi " + maior + ".");
		System.out.println("A média dos números vale " + String.format("%.2f", media) + ".");
		sc.close();
	}
}
