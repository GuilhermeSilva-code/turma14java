package listatarefa2;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		/*
		 * 3) Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e
			finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3, num4, quadrado1, quadrado2, quadrado3, quadrado4;
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextInt();
		System.out.print("Digite o quarto número: ");
		num4 = leia.nextInt();
		
		quadrado1 = num1*num1;
		quadrado2 = num2*num2;
		quadrado3 = num3*num3;
		quadrado4 = num4*num4;
		
		if (quadrado3 >=1000) 
		{
			System.out.println("O valor do quadrado do terceiro número é: "+quadrado3);
		}
		else 
		{
			System.out.println();
			System.out.print("O valor do quadrado do primeiro número é: "+quadrado1);
			System.out.println();
			System.out.print("O valor do quadrado do segundo número é: "+quadrado2);
			System.out.println();
			System.out.print("O valor do quadrado do quarto número é: "+quadrado4);
			
		}
		
	}

}
