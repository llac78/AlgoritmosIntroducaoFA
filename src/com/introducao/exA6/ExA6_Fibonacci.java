package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_Fibonacci {

	public static void main(String[] args) {
		
		int fb1 = 0;
		int fb2 = 1;
		int fb3 = 0;
		
		System.out.print("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(0);
		System.out.println(1);
		for (int i = 2; i < n; i++) {
			fb3 = fb1+fb2;
			if(fb3 < n) {
				System.out.println(fb3);
			} else {
				break;
			}
			fb1 = fb2;
			fb2 = fb3;
		}
		sc.close();
	}
}
