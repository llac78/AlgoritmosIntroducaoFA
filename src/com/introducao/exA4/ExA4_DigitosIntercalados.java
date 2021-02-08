package com.introducao.exA4;

import java.util.Scanner;

public class ExA4_DigitosIntercalados {

	public static void main(String[] args) {

		int numeroValido1 = 0;
		int numeroValido2 = 0;
		
		int tam1 = String.valueOf(numeroValido1).length();
		int tam2 = String.valueOf(numeroValido2).length();
		
		numeroValido1 = extracted(numeroValido1, tam1); 
		numeroValido2 = extracted(numeroValido2, tam2); 
		
		System.out.println("Resultado dos dígitos intercalados: " + intercalar(numeroValido1, numeroValido2));
	}

	private static int extracted(int numeroValido, int tam) {
		int numero;
		while (tam != 5){
			System.out.print("Digite um número: ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			tam = String.valueOf(numero).length();
			
			if(tam == 5) {
				numeroValido = numero;
				break;
			} 
			sc.close();
		}
		
		return numeroValido;
	}
	
	private static String intercalar(int numeroValido1, int numeroValido2) {
		String resultado = "";
		String n1 = String.valueOf(numeroValido1);
		String n2 = String.valueOf(numeroValido2);
		
		for (int i = 0; i < 5; i++) {
			resultado += n1.substring(i, i + 1) + n2.substring(i, i + 1);
		}
		return resultado;
	}
	
}
