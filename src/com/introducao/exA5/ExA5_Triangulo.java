package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Triangulo {

	public static void main(String[] args) {
		
		String tipoTriangulo = "";
		
		System.out.print("Digite o primeiro n�mero: ");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		Scanner sc3 = new Scanner(System.in);
		int n3 = sc3.nextInt();
		
		if ( (n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2) ) {
			if (n1 == n2 && n1 == n3) {
				tipoTriangulo = "equil�tero";
				
			} else if (n1 != n2 && n1 != n3 && n2 != n3) {
				tipoTriangulo = "escaleno";
				
			} else if ( (n1 != n2 && n2 == n3) || (n1 != n2 && n1 == n3) || (n1 != n3 && n2 == n1) ){
				tipoTriangulo = "is�sceles";
			}
			System.out.println("O tipo do tri�ngulo � " + tipoTriangulo);
		} else {
			System.out.println("N�o � tri�ngulo!");
		}
		sc1.close();
		sc2.close();
		sc3.close();
		
	}
	

}
