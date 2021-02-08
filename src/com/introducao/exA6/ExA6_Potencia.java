package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Potencia {

	public static void main(String[] args) {
		
		long fatorial = 1;
		
		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		for (int i = numero; i > 0; i--) {
			fatorial *= i;
		}
		System.out.println("Fatorial: " + fatorial);
		sc.close();
	}
}
