package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Notas {

	public static void main(String[] args) {
		
		float n1 = armazenarNota();
		float n2 = armazenarNota();
		float n3 = armazenarNota();
		
		float media = calcularMedia(n1, n2, n3);
		
		mostrarResultado(media);
	}

	private static void mostrarResultado(float media) {
		if(media >= 7) {
			System.out.println("Média final: " + media + ". Aluno aprovado!");
		} else {
			System.out.println("Média final: " + media + ". Aluno reprovado!");
		}
	}

	private static float armazenarNota() {
		System.out.print("Digite a nota: ");
		Scanner sc = new Scanner(System.in);
		float nota = sc.nextFloat();
		sc.close();
		
		return nota;
	}
	
	private static float calcularMedia(float n1, float n2, float n3) {
		return ((n1 * 2) + (n2 * 3) + (n3 * 5))/10;
	}
	
}
