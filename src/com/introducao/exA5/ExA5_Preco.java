package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Preco {

	public static void main(String[] args) {
		
		System.out.print("Digite o valor de compra do produto: ");
		Scanner sc = new Scanner(System.in);
		float valorCompra = sc.nextFloat();
		
		calcularValorVenda(valorCompra);
		
		System.out.println("O valor de venda é R$ " + String.format("%.2f", calcularValorVenda(valorCompra)) + "." );
		sc.close();
	}

	private static float calcularValorVenda(float valorCompra) {
		float valorVenda = 0;
		
		if(valorCompra < 20) {
			valorVenda = valorCompra * 1.45f;
		} else {
			valorVenda = valorCompra * 1.3f;
		}
		
		return valorVenda;
	}
}


