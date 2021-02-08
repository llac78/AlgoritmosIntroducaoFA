package com.introducao.exA1;

import java.util.Scanner;

public class ExA1_AreaTriangulo {

	public static void main(String[] args) {
		
		System.out.print("Digite o valor da base do tri�ngulo: ");
		Scanner scBase = new Scanner(System.in);
		float base = scBase.nextFloat();
		
		System.out.print("Digite o valor da altura do tri�ngulo: ");
		Scanner scAltura = new Scanner(System.in);
		float altura = scAltura.nextFloat();
		
		System.out.println("A �rea do tri�ngulo �: " + String.format("%.2f", calcularArea(base, altura)) );
		scBase.close();
		scAltura.close();
	}
	
	static float calcularArea(float base, float altura) {
		float area = (base * altura) / 2;
		return area;
	}

}
