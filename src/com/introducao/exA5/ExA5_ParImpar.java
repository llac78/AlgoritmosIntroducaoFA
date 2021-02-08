package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_ParImpar {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		long numero = sc.nextLong();
		
		if(numero >= 20) {
			System.out.println(numero/2);
		} else {
			System.out.println("O número é menor do que 20. Tente novamente.");
		}
		sc.close();
	}

}
