package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Multiplo3 {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero % 3 == 0) {
			System.out.println(numero + " é múltiplo de 3.");
		} else {
			System.out.println(numero + " não é múltiplo de 3.");
		}
		sc.close();
	}

}
