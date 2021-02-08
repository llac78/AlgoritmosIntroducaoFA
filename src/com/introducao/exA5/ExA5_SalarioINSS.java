package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_SalarioINSS {

	public static void main(String[] args) {

		System.out.print("Digite o valor do salário: ");
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();

		calcularDesconto(salario);
		sc.close();
	}

	private static void calcularDesconto(double salario) {
		String percentual = "";
		double desconto = 0;

		if (salario <= 600) {
			System.out.println("ISENTO");

		} else {
			if (salario > 600 && salario <= 1200) {
				percentual = "20%";
				desconto = salario * 0.2;

			} else if (salario > 1200 && salario <= 2000) {
				percentual = "25%";
				desconto = salario * 0.25;

			} else if (salario > 2000) {
				percentual = "30%";
				desconto = salario * 0.3;

			}
			System.out.println("O percentual de desconto foi " + percentual + " e seu valor final é R$ "
					+ String.format("%.2f", desconto) + ".");
		}
	}
}
