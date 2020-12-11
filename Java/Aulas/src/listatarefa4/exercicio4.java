package listatarefa4;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		/*
		 *Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
		 *e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		 *diagonal, ou seja, diagonal principal. 
		 */
		
		int [][] matriz = new int [3][3];
		int [][] soma = new int [matriz.length] [matriz.length];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for(int linha = 0; linha <3; linha++){
			for(int coluna = 0; coluna <3; coluna++){
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = entrada.nextInt();
			}
		}
			
		System.out.println("\nA matriz ficou: \n");
		for(int linha = 0; linha <3; linha++){
			for(int coluna = 0; coluna <3; coluna++){
				System.out.printf(" %d ",matriz[linha][coluna]);
			}
					
		}
		
		for (int linha = 0; linha< soma.length; linha++){
			for(int coluna = 0; coluna< soma.length; coluna++){
				
				System.out.printf("\nA soma da matriz é: ", soma[linha][coluna]);
			}
		}
			
	}
}
