package listatarefa2;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem 
		indicando se este número é par ou ímpar, e se é positivo ou negativo.
		*/
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor positivo inteiro acima de 0: ");
		int valor = leia.nextInt();
		System.out.println(((valor % 2)==0)?"Valor é par!!!":"Valor é impar!!!"); //tenório
		//refatoração
		/*
		if ((valor % 2)==0) {
			System.out.println("Valor é par!!!");
		}
		else
		{
			System.out.println("Valor é impar!!!");
		}*/

	}

}
