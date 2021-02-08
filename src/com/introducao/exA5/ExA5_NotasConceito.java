package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_NotasConceito {

	public static void main(String[] args) {

		System.out.print("Digite a média do aluno: ");
		Scanner sc = new Scanner(System.in);
		float media = sc.nextFloat();

		avaliarMedia(media);
		sc.close();
	}

	private static void avaliarMedia(float media) {
		String conceito = "";
		String resultado = "";

		if (media >= 9) {
			conceito = Constantes.CONCEITO_A;
			resultado = Constantes.APROVADO; 

		} else if (media >= 7.5 && media < 9) {
			conceito = Constantes.CONCEITO_B;
			resultado = Constantes.APROVADO;

		} else if (media >= 6 && media < 7.5) {
			conceito = Constantes.CONCEITO_C;
			resultado = Constantes.APROVADO;

		} else if (media >= 4 && media < 6) {
			conceito = Constantes.CONCEITO_D;
			resultado = Constantes.REPROVADO;

		} else if ( media < 4) {
			conceito = Constantes.CONCEITO_E;
			resultado = Constantes.REPROVADO;
		}
		System.out.println("Aluno " + resultado + " com conceito " + conceito + ".");
	}
}

