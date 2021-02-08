package com.introducao.exA6;

public class ExA6_Pares1ate100 {

	public static void main(String[] args) {

		int[] numeros = new int[100];

		for (int i = 0; i < numeros.length + 1; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		// ou

		for (int i = 0; i < numeros.length + 1; i ++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
