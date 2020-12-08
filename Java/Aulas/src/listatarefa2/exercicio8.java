package listatarefa2;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		/*
		 * 8) Construa um sistema para ler uma variável numérica N e imprimi-la
		 *  somente se a mesma for maior que 100, caso contrário imprimi-la com o
		 *   valor zero.
		 */
		Scanner leia = new Scanner(System.in);
		int numero=0;
		
		System.out.println("Digite um número maior que 100: ");
		numero = leia.nextInt();
		
		if (numero>=100) 
		{
			System.out.println("O número digitado é: "+numero);
		}
		else 
		{
			System.out.println("O número informado é menor que 100!!!");
		}
		
	}
}
