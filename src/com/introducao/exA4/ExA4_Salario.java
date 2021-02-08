package com.introducao.exA4;

import java.util.Scanner;

public class ExA4_Salario {
	
	static final float salarioMinimo = 900;

	public static void main(String[] args) {

		System.out.print("Digite o valor do salário: ");
		Scanner sc = new Scanner(System.in);
		float salario = sc.nextFloat();
		
		System.out.println("A pessoa recebe, aproximadamente, " + String.format("%.1f", calcularSalario(salario)) + " salário(s) mínimo(s).");
		
		sc.close();
	}
	
	static float calcularSalario(float salario) {
		float qtdSalarioMinimo = salario/salarioMinimo;
		
		return qtdSalarioMinimo;
	}

}
