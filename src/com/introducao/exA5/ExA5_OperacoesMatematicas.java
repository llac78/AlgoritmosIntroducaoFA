package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_OperacoesMatematicas {

	public static void main(String[] args) {
		
		System.out.print("Digite o primeiro n�mero: ");
		Scanner sc1 = new Scanner(System.in);
		double n1 = sc1.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		Scanner sc2 = new Scanner(System.in);
		double n2 = sc2.nextDouble();
		
		System.out.print("Digite a opera��o desejada: ");
		Scanner sc3 = new Scanner(System.in);
		char op = sc3.next().charAt(0);
		
		double resultado = 0;
		switch (op) {
			case '*':
				resultado = n1 * n2;
				break;
	
			case '/':
				resultado = n1 / n2;
				break;
	
			case '+':
				resultado = n1 + n2;
				break;
	
			case '-':
				resultado = n1 - n2;
				break;
	
			default:
				break;
		}
		System.out.println("Resultado: " + resultado);
		sc1.close();
		sc2.close();
		sc3.close();
	}
	

}
