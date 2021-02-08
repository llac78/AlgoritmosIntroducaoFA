package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_OrdemCrescente {

	public static void main(String[] args) {
		
		int[] numeros = new int[3];

		System.out.print("Digite o primeiro número: ");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		
		System.out.print("Digite o segundo número: ");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		Scanner sc3 = new Scanner(System.in);
		int n3 = sc3.nextInt();
		
		if (n1 < n2 && n1 < n3) {
			numeros[0] = n1;
			if(n2 < n3) {
				numeros[1] = n2;
				numeros[2] = n3;
			} else {
				numeros[1] = n3;
				numeros[2] = n2;
			}
		} else if (n2 < n1 && n2 < n3) {
			numeros[0] = n2;
			if(n1 < n3) {
				numeros[1] = n1;
				numeros[2] = n3;
			} else {
				numeros[1] = n3;
				numeros[2] = n1;
			}
		} else if (n3 < n1 && n3 < n2) {
			numeros[0] = n3;
			if(n1 < n2) {
				numeros[1] = n1;
				numeros[2] = n2;
			} else {
				numeros[1] = n2;
				numeros[2] = n1;
			}
		} 
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		sc1.close();
		sc2.close();
		sc3.close();
		
	}
	

}
