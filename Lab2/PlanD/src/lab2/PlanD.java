package lab2;

import java.util.Scanner;

public class PlanD {
	
	public static String input(String text) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(text);
		String opcao = sc.nextLine();
		
		return opcao;
	}
	
	public static void main(String[] args) {
		String opcao = input("Qual o plano? ");
		
		while (!opcao.equals("SAIR")) {;
		
			if (opcao.equals("ESTUDO")) {
				
				String dados = input("Dados do Plano? [NOME]");
				
			} else if (opcao.equals("ORGANIZACAO")) {
				
				String dados = input("Dados do Plano? [LOCAL]");
				
			} else if (opcao.equals("LAZER")) {
				
				String dados = input("Dados do Plano? ");
				
			} else if (opcao.equals("ESTUDO")) {
				
				String dados = input("Dados do Plano? ");
				
			}
			
			opcao = input("Qual o plano? ");
		}
		
		sc.close();
    }  
}