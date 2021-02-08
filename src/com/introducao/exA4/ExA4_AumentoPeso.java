package com.introducao.exA4;

import java.util.Scanner;

public class ExA4_AumentoPeso {

	public static void main(String[] args) {

		System.out.print("Digite o valor do peso da pessoa: ");
		Scanner sc = new Scanner(System.in);
		float pesoInicial = sc.nextFloat();
		
		System.out.println("O valor do peso aumentado em 12% é " + calcularPeso(pesoInicial) + "Kg.");
		
		sc.close();
	}
	
	static float calcularPeso(float pesoInicial) {
		float pesoFinal = pesoInicial + pesoInicial * 0.12f;
		
		return pesoFinal;
	}

}
