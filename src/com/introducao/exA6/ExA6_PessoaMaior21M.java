package com.introducao.exA6;

import java.util.Scanner;

public class ExA6_PessoaMaior21M {

	public static void main(String[] args) {
		
		String[] nomes = new String[3];
		int[] idades = new int[3];
		char[] sexos = new char[3];
		
		String[] nomes1 = new String[3];
		int[] idades1 = new int[3];
		char[] sexos1 = new char[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o nome: ");
			Scanner scNome = new Scanner(System.in); 
			nomes[i] = scNome.nextLine();
			
			System.out.print("Digite a idade: ");
			Scanner scIdade = new Scanner(System.in); 
			idades[i] = scIdade.nextInt();
			
			System.out.print("Digite o sexo: ");
			Scanner scSexo = new Scanner(System.in); 
			sexos[i] = scSexo.next().charAt(0);
			
			if(idades[i] > 21 && sexos[i] == 'M') {
				nomes1[i] = nomes[i] ;
				idades1[i] = idades[i];
				sexos1[i] = sexos[i];
			}
			scIdade.close();
			scNome.close();
			scSexo.close();
		}
		for (int i = 0; i < 3; i++) {
			if(idades[i] > 21 && sexos[i] == 'M') {
				System.out.println("Nome: " + nomes1[i] + " | Idade: " + idades1[i] + " | Sexo: " + sexos1[i]);
			}
		}
		
	}
}
