package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_ValorScomPotencia {

	public static void main(String[] args) {

		int s = 0;

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			s += Math.pow(i, i);
		}
		System.out.println("O valor de S é " + s);

		sc.close();
	}
}
