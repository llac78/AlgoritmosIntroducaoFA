package com.introducao.exA4;

import java.util.Scanner;

public class ExA4_ABeBA {

	public static void main(String[] args) {

		int a = getNumero();
		int b = getNumero();
		int aux = 0;
		
		System.out.println(a + " - " + b);
		
		aux = b;
		b = a;
		a = aux;
		
		System.out.println(a + " - " + b);
		
	}
	
	private static int getNumero() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		return numero;
	}

}
