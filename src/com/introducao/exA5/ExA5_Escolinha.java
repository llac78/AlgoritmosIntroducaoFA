package com.introducao.exA5;

import java.util.Scanner;

public class ExA5_Escolinha {

	public static void main(String[] args) {

		System.out.print("Digite a idade da criança: ");
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		
		String turma = "";
		
		if(idade < 4 || idade > 10) {
			System.out.println("A escolinha não possui turmas para a idade informada.");
		} else {
			if(idade <= 4 && idade <= 5) {
				turma = "A";
			} else if(idade <= 6 && idade <= 8) {
				turma = "B";
			} else if(idade <= 9 && idade <= 10) {
				turma = "C";
			}
			System.out.println("A criança terá aulas na turma " + turma + ".");
		}
		sc.close();
	}

}
