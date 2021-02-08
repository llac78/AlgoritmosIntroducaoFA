package com.introducao.exA1;

import java.util.Scanner;

public class ExA1_AreaCircunferencia {

	static final double pi = Math.PI;
	
	public static void main(String[] args) {
		
		System.out.print("Digite o valor do raio da circunferência: ");
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		
		System.out.println("A área da circunferência é: " + String.format("%.2f", calcularArea(raio)) );
		sc.close();
	}

	static double calcularArea(double raio) {
		return pi * Math.pow(raio, 2) / 2;
	}

}
