package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_NumeroPositivoPotencia {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		float numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("Resultado: " + String.format("%.2f", numero/2) );
		} else {
			System.out.println("Resultado: " + String.format("%.2f", Math.pow(numero, 2)) );
		}
		sc.close();
	}

}
