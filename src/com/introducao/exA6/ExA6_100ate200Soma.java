package com.introducao.exA6;

public class ExA6_100ate200Soma {

	public static void main(String[] args) {
		
		int soma = 0;

		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
			soma += i;
		}
		System.out.println("Soma: " + soma);
	}
}
