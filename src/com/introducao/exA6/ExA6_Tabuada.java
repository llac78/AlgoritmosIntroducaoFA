package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Tabuada {

	public static void main(String[] args) {
		
		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
		sc.close();
	}
}
