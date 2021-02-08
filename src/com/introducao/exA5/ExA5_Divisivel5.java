package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Divisivel5 {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero % 5 == 0) {
			System.out.println(numero + " é divisível por 5.");
		} else {
			System.out.println(numero + " não é divisível por 5.");
		}
		sc.close();
	}

}
