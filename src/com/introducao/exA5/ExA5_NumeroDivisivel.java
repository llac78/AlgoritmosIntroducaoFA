package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_NumeroDivisivel {

	public static void main(String[] args) {

		System.out.print("Digite um n�mero: ");
		Scanner sc = new Scanner(System.in);
		long numero = sc.nextLong();
		
		if(numero % 10 == 0) {
			System.out.println(numero + " � divis�vel por 10.");
		} else if (numero % 5 == 0) {
			System.out.println(numero + " � divis�vel por 5.");
		} else if (numero % 2 == 0) {
			System.out.println(numero + " � divis�vel por 2.");
		} else {
			System.out.println(numero + " n�o � divis�vel por 10 , 5 e nem 2.");
		}
		sc.close();
	}

}
