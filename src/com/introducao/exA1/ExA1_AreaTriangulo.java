package com.introducao.exA1;

import java.util.Scanner;

public class ExA1_AreaTriangulo {

	public static void main(String[] args) {
		
		System.out.print("Digite o valor da base do triângulo: ");
		Scanner scBase = new Scanner(System.in);
		float base = scBase.nextFloat();
		
		System.out.print("Digite o valor da altura do triângulo: ");
		Scanner scAltura = new Scanner(System.in);
		float altura = scAltura.nextFloat();
		
		System.out.println("A área do triângulo é: " + String.format("%.2f", calcularArea(base, altura)) );
		scBase.close();
		scAltura.close();
	}
	
	static float calcularArea(float base, float altura) {
		float area = (base * altura) / 2;
		return area;
	}

}
