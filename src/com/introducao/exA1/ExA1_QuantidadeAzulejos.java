package com.introducao.exA1;

import java.util.Scanner;

public class ExA1_QuantidadeAzulejos {

	public static void main(String[] args) {

		System.out.print("Digite o valor do comprimento da parede: ");
		Scanner scComprimento = new Scanner(System.in);
		float comprimento = scComprimento.nextFloat();
		
		System.out.print("Digite o valor da altura da parede: ");
		Scanner scAltura = new Scanner(System.in);
		float altura = scAltura.nextFloat();
		
		System.out.println("A quantidade de azulejos necessária será " + calcularQuantidadeAzulejos(altura, comprimento) + "m².");
		
		scAltura.close();
		scComprimento.close();
	}
	
	static float calcularQuantidadeAzulejos(float altura, float comprimento) {
		return altura * comprimento;
	}

}
