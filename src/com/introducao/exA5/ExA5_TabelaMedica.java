package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_TabelaMedica {

	public static void main(String[] args) {
		
		System.out.print("Digite o sexo da pessoa: ");
		Scanner scSexo = new Scanner(System.in);
		char sexo = scSexo.next().charAt(0);
		
		System.out.print("Digite a altura da pessoa: ");
		Scanner scAltura = new Scanner(System.in);
		float altura = scAltura.nextFloat();
		
		Pessoa p = new Pessoa();
		p.setSexo(sexo);
		p.setAltura(altura);
		
		System.out.println("O peso ideal para esta pessoa é " + String.format("%.2f", calcularPesoIdeal(p))  + "Kg.");
		
		scAltura.close();
		scSexo.close();
	}

	private static float calcularPesoIdeal(Pessoa p) {
		float pesoIdeal;
		
		if(p.getSexo() == 'M' ) {
			pesoIdeal = (float) ((72.7 * p.getAltura()) - 58);
		} else {
			pesoIdeal = (float) ((62.1 * p.getAltura()) - 44.7);
		}
		
		return pesoIdeal;
	}
}
