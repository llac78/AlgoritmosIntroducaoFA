package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_MaiorDoisNumeros {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner sc1 = new Scanner(System.in);
		long n1 = sc1.nextLong();
		
		System.out.print("Digite um número: ");
		Scanner sc2 = new Scanner(System.in);
		long n2 = sc2.nextLong();
		
		if(n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		} else if (n1 < n2) {
			System.out.println(n2 + " é maior que " + n1);
		} else {
			System.out.println("Os números são iguais!");
		}
		sc1.close();
		sc2.close();
	}

}
