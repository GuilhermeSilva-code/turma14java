package listatarefa2;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		/*4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem 
		indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
		*/
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor positivo inteiro acima de 0: ");
		int valor = leia.nextInt();
		System.out.println(((valor % 2)==0)?"Valor � par!!!":"Valor � impar!!!"); //ten�rio
		//refatora��o
		/*
		if ((valor % 2)==0) {
			System.out.println("Valor � par!!!");
		}
		else
		{
			System.out.println("Valor � impar!!!");
		}*/

	}

}
