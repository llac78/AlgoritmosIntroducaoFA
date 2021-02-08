package com.introducao.exA6;

import java.util.Random;
import java.util.Scanner;

public class ExA6_MaiorNumeroDigitado {

	public static void main(String[] args) {

		Random random = new Random();
		int sorteado = random.nextInt(100) + 1;
		String resultado = "";
		int counter = 0;
		int num = 0;

		while (num != sorteado) {
			counter++;
			System.out.print("Digite um número: ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			
			if(num > sorteado ) {
				resultado = "maior";
			} else if(num < sorteado) {
				resultado = "menor";
			} else {
				resultado = "igual";
				break;
			}
			System.out.println("O número informado é " + resultado + " do que o sorteado.");
			sc.close();
		}
		System.out.println("Quantidade de tentativas para acertar o número sorteado: " + counter + ".");
	}
}
