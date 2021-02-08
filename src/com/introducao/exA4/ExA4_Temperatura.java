package com.introducao.exA4;

import java.util.Scanner;

public class ExA4_Temperatura {

	public static void main(String[] args) {

		System.out.print("Digite a temperatura em Celsius: ");
		Scanner sc = new Scanner(System.in);
		float temperatura = sc.nextFloat();
		
		System.out.println(temperatura + "°C em Fahrenheit é " + String.format("%.2f", calcularFahrenheit(temperatura)) + "°F. ");
		sc.close();
	}
	
	static float calcularFahrenheit(float temperatura) {
		return ( temperatura * 9/5 ) + 32;
	}

}
