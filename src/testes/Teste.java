package testes;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

//		String n = "999";
//		
//		for (int i = 0; i < n.length(); i++) {
//			System.out.println(n.substring(i, i + 1));
//		}
		
//		String expressao = "1/2-3/4+5/6";
//		
//		String[] fracao = expressao.split("-");
//		System.out.println(fracao[0]);
//		
//		for (int i = 0; i < fracao.length; i++) {
//			String n =  fracao[i].substring(0, 1);
//			System.out.println(n);
//		}
//		Float num = Float.valueOf(fracao[0].substring(0, 1));
//		System.out.println(num);
//		
//		String x = "1/2";
//		System.out.println("---" + x.substring(0,1));
//		System.out.println("---" + x.substring(1,2));
//		System.out.println("---" + x.substring(2,3));
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(n != 5) {
			System.out.println(n);
			n = sc.nextInt();
			
			if(n == 5) {
				System.out.println("Saindo");
				break;
			}
		}
		System.out.println("Saiu");
		
	}

	
}
