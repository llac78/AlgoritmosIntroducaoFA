package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_TriploNumeros {

	public static void main(String[] args) {
		
		System.out.print("Digite a quantidade de n�meros que ser�o informados: ");
		Scanner scQtd = new Scanner(System.in); 
		int qtd = scQtd.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite um n�mero: ");
			Scanner sc = new Scanner(System.in); 
			int n = sc.nextInt();
			System.out.println("O triplo de "+ n + " � " + n * 3);
			sc.close();
		}
		scQtd.close();
	}
}
