package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_SalarioAumento {

	public static void main(String[] args) {
		
		System.out.print("Digite o valor do salário: ");
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		
		calcularAumentoSalario(salario);
		sc.close();
	}

	private static void calcularAumentoSalario(double salario) {
		String percentual = "";
		
		if(salario > 2500) {
			System.out.println("Sem aumento.");
		} else {
			if(salario <= 400) {
				salario = salario * 1.15;
				percentual = "15%";
				
			} else if(salario > 400 && salario <= 700) {
				salario = salario * 1.12;
				percentual = "12%";
				
			} else if(salario > 700 && salario <= 1000) {
				salario = salario * 1.1;
				percentual = "10%";
				
			} else if(salario > 1000 && salario <= 1800) {
				salario = salario * 1.07;
				percentual = "7%";
				
			} else if(salario > 1800 && salario <= 2500) {
				salario = salario * 1.04;
				percentual = "4%";
			}
			System.out.println("O percentual de aumento foi " + percentual + " e o salário final é R$ " + String.format("%.2f", salario) + "." );
		}
	}
}


