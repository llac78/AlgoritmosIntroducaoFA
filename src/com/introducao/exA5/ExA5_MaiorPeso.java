package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_MaiorPeso {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1 = armazenarPessoa();
		p2 = armazenarPessoa();
		
		float maiorPeso = calcularMaiorPeso(p1.getPeso(), p2.getPeso());
		
		if(maiorPeso == p1.getPeso()) {
			System.out.println(p1.toString());
		} else {
			System.out.println(p2.toString());
		}
	}

	private static float calcularMaiorPeso(float peso1, float peso2) {
		float maiorPeso = 0;
		
		if(peso1 > peso2) {
			maiorPeso = peso1;
		} else {
			maiorPeso = peso2;
		} 
		
		return maiorPeso;
	}

	private static Pessoa armazenarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Digite o nome: ");
		Scanner scNome = new Scanner(System.in);
		String nome = scNome.nextLine();
		pessoa.setNome(nome);
		
		System.out.print("Digite o peso: ");
		Scanner scPeso = new Scanner(System.in);
		float peso = scPeso.nextFloat();
		pessoa.setPeso(peso);
		scNome.close();
		scPeso.close();

		return pessoa;
	}
	
}
