package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Maior20 {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		long numero = sc.nextLong();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é par.");
		} else {
			System.out.println(numero + " é ímpar.");
		}
		sc.close();
	}

}
