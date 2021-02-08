package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Eleicoes {

	public static void main(String[] args) {
		
		final String CANDIDATO_A = "A";
		final String CANDIDATO_B = "B";
		final String INDECISO = "C";
		double total = 10;
		int qtdA = 0;
		int qtdB = 0;
		int qtdC = 0;
		String percentualA = "";
		String percentualB = "";
		String percentualC = "";
		
		for (int i = 0; i < total; i++) {
			System.out.print("Digite seu voto: ");
			Scanner sc = new Scanner(System.in);
			String voto = sc.nextLine().toUpperCase();

			if(voto.equals(CANDIDATO_A)) {
				qtdA++;
			} else if(voto.equals(CANDIDATO_B)) {
				qtdB++;
			} else if(voto.equals(INDECISO)) {
				qtdC++;
			}
			sc.close();
		}
		percentualA = String.format("%.2f", ((qtdA/total) * 100)) + "%"; 
		percentualB = String.format("%.2f", ((qtdB/total) * 100)) + "%"; 
		percentualC = String.format("%.2f", ((qtdC/total) * 100)) + "%"; 
		System.out.println("Intenções de voto para o candidato A: "+ percentualA);
		System.out.println("Intenções de voto para o candidato B: "+ percentualB);
		System.out.println("Intenções para votos indecisos: "+ percentualC);
	}
}
