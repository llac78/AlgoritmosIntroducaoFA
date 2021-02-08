package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Triangulo {

	public static void main(String[] args) {
		
		String tipoTriangulo = "";
		
		System.out.print("Digite o primeiro número: ");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		
		System.out.print("Digite o segundo número: ");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		Scanner sc3 = new Scanner(System.in);
		int n3 = sc3.nextInt();
		
		if ( (n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2) ) {
			if (n1 == n2 && n1 == n3) {
				tipoTriangulo = "equilátero";
				
			} else if (n1 != n2 && n1 != n3 && n2 != n3) {
				tipoTriangulo = "escaleno";
				
			} else if ( (n1 != n2 && n2 == n3) || (n1 != n2 && n1 == n3) || (n1 != n3 && n2 == n1) ){
				tipoTriangulo = "isósceles";
			}
			System.out.println("O tipo do triângulo é " + tipoTriangulo);
		} else {
			System.out.println("Não é triângulo!");
		}
		sc1.close();
		sc2.close();
		sc3.close();
		
	}
	

}
