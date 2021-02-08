package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Fatorial {

	public static void main(String[] args) {
		
		double potencia;
		
		System.out.print("Digite a base: ");
		Scanner scBase = new Scanner(System.in);
		int base = scBase.nextInt();
		
		System.out.print("Digite o expoente: ");
		Scanner scExpoente = new Scanner(System.in);
		int expoente = scExpoente.nextInt();

		potencia = Math.pow(base, expoente); 

		System.out.println("Potência: " + potencia);
		scBase.close();
		scExpoente.close();
	}
}
