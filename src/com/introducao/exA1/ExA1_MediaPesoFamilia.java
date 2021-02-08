package com.introducao.exA1;

import java.util.Scanner;

public class ExA1_MediaPesoFamilia {

	public static void main(String[] args) {
		
		float[] pesos = new float[5];
		float pesoTotal = 0;

		for (int i = 1; i <= pesos.length; i++) {
			System.out.print("Digite o valor do peso da " + i + "ª pessoa: ");
			Scanner sc = new Scanner(System.in);
			pesoTotal += sc.nextFloat();
			sc.close();
		}
		
		System.out.println("A média dos pesos desta família é " + String.format("%.2f", calcularMediaPesos(pesoTotal))  + "Kg.");
		
	}
	
	static float calcularMediaPesos(float pesoTotal) {
		return pesoTotal / 5;
	}

}
