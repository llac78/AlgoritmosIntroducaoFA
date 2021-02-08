package com.introducao.exA6;

public class ExA6_Tabuada2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 10; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
		}
	}
}
