package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_PesquisaMercado {

	public static void main(String[] args) {
		
		final String MASCULINO = "M";
		final String FEMININO = "F";
		boolean gostou = false;
		int total = 0;
		int totalMasculino = 0;
		int qtdGostou = 0;
		int qtdNaoGostou = 0;
		double qtdNaoGostouMasculino = 0;
		String percentualMascNaoGostou = "";
		int sexoAceitacaoMasculino = 0;
		int sexoAceitacaoFeminino = 0;
		String sexoAceitacao = "";
		
		System.out.print("Digite a quantidade de participantes: ");
		Scanner sc = new Scanner(System.in);
		total = sc.nextInt();
		
		for (int i = 0; i < total; i++) {
			System.out.print("Digite o sexo (M/F): ");
			Scanner scSexo = new Scanner(System.in);
			String sexo = scSexo.nextLine().toUpperCase();
			
			System.out.print("Gostou do novo produto? R: ");
			Scanner scGostou = new Scanner(System.in);
			gostou = scGostou.nextBoolean();
			
			if(sexo.equals(MASCULINO)) {
				totalMasculino++;
			} 

			if(gostou) {
				qtdGostou++;
				if(sexo.equals(MASCULINO)) {
					sexoAceitacaoMasculino++;
				} else if(sexo.equals(FEMININO)){
					sexoAceitacaoFeminino++;
				}
			} else {
				qtdNaoGostou++;
				if(sexo.equals(MASCULINO)) {
					qtdNaoGostouMasculino++;
				}
			} 
			scGostou.close();
			scSexo.close();
		}
		percentualMascNaoGostou = String.format("%.2f", ((qtdNaoGostouMasculino/totalMasculino) * 100)) + "%"; 
		if(sexoAceitacaoMasculino > sexoAceitacaoFeminino) {
			sexoAceitacao = MASCULINO;
		} else if(sexoAceitacaoMasculino < sexoAceitacaoFeminino) {
			sexoAceitacao = FEMININO;
		} else {
			sexoAceitacao = "MESMA ACEITAÇÃO";
		}
		System.out.println("Quantidade de pessoas que gostaram do produto: " + qtdGostou);
		System.out.println("Quantidade de pessoas que não gostaram do produto: " + qtdNaoGostou);
			
		System.out.println("Percentagem de pessoas do sexo masculino que não gostaram do produto: "+ percentualMascNaoGostou);
		System.out.println("Sexo em que o produto teve uma melhor aceitação: "+ sexoAceitacao);
		
		sc.close();
	}
}
