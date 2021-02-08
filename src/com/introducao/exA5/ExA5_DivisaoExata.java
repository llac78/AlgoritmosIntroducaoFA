package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_DivisaoExata {

	public static void main(String[] args) {
		int dividendo = armazenarNumero();
		int divisor = armazenarNumero();
		
		int resto = dividendo % divisor;
		
		if(resto == 0) {
			System.out.println("A divisão de " + dividendo + " por " + divisor + " é exata.");
		} else {
			System.out.println("A divisão de " + dividendo + " por " + divisor + " é inexata. O resto vale " + resto + ".");
		}
	}

	private static int armazenarNumero() {
		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		return numero;
	}
	
}
