package listatarefa2;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		/*
		 * 3) Desenvolva um sistema em que:
			Leia 4 (quatro) n�meros;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e
			finalize;
			Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
		 */
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3, num4, quadrado1, quadrado2, quadrado3, quadrado4;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		System.out.print("Digite o quarto n�mero: ");
		num4 = leia.nextInt();
		
		quadrado1 = num1*num1;
		quadrado2 = num2*num2;
		quadrado3 = num3*num3;
		quadrado4 = num4*num4;
		
		if (quadrado3 >=1000) 
		{
			System.out.println("O valor do quadrado do terceiro n�mero �: "+quadrado3);
		}
		else 
		{
			System.out.println();
			System.out.print("O valor do quadrado do primeiro n�mero �: "+quadrado1);
			System.out.println();
			System.out.print("O valor do quadrado do segundo n�mero �: "+quadrado2);
			System.out.println();
			System.out.print("O valor do quadrado do quarto n�mero �: "+quadrado4);
			
		}
		
	}

}
