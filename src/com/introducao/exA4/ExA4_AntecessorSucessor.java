package com.introducao.exA4;

import java.util.Scanner;

public class ExA4_AntecessorSucessor {

	public static void main(String[] args) {

		System.out.print("Digite um n�mero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int antecessor = --numero;
		int sucessor = ++numero;
		
		System.out.println("O antecessor de " + numero + " � " + antecessor);
		System.out.println("O sucessor de " + numero + " � " + sucessor);
		
		sc.close();
	}

}
