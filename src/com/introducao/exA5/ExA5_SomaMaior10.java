package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_SomaMaior10 {

	public static void main(String[] args) {
		
		int soma = 0;

		System.out.print("Digite o primeiro número: ");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		
		System.out.print("Digite o segundo número: ");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		
		soma = n1 + n2;
		
		if(soma > 10) {
			System.out.println("Resutado: " + soma);
		} else {
			System.out.println("A soma é menor do que 10. Tente novamente.");
		}
		sc1.close();
		sc2.close();
	}

}
