package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_NumeroEntre20e90 {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero >= 20 && numero <= 90) {
			System.out.println(numero + " está entre 20 e 90.");
		} else {
			System.out.println(numero + " não está entre 20 e 90.");
		}
		sc.close();
	}

}
