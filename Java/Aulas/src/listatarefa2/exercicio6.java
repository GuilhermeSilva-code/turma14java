package listatarefa2;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		
		/*
		 * 6) Elabore um sistema que dada a idade de um nadador classifique-o 
		 * em uma das seguintes categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos
		 */
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >=5 && idade <=7) 
		{
			System.out.println("Você está na categoria Infaltil A, parabéns!!!");
		}
		else if (idade >=8 && idade <=11) 
		{
			System.out.println("Você está na categoria Infaltil B, parabéns!!!");
		}
		else if (idade >=12 && idade <=13) 
		{
			System.out.println("Você está na categoria Juvenil A, parabéns!!!");
		}
		else if (idade >=14 && idade <=17) 
		{
			System.out.println("Você está na categoria Juvenil B, parabéns!!!");
		}
		else if (idade >=18) 
		{
			System.out.println("Você está na categoria adultos, parabéns!!!");
		}
		else 
		{
			System.out.println("OPS, idade fora da categoria!!!");
		}
		
	}

}
