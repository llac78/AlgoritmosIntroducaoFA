package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_1ateNProduto {

	public static void main(String[] args) {
		
		long produto = 1;
		
		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
			produto *= i;
		}
		System.out.println("Produto: " + produto);
		sc.close();
	}
}
