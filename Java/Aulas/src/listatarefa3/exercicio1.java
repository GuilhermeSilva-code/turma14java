package listatarefa3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 *  coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:
			a) m�dia do sal�rio da popula��o;
			b) m�dia do n�mero de filhos;
			c) maior sal�rio;
			d) percentual de pessoas com sal�rio at� R$100,00.
		 */
		
		Scanner leia = new Scanner(System.in);
		//variaveis
		final int HABITANTES=20;
		
		
		 double salario = 0.0;
		 double numeroFilhos = 0, totalFilhos = 0;
		 double mediaSalarios = 0.0, mediaNumeroFilhos = 0.0;
		 double maiorSalario = 0.0, percentualPessoas100 = 0.0, totalSalarios=0.0;
		 double conta100=0.00;
		 
		 for (int habitantes = 1 ; habitantes <= HABITANTES; habitantes++);
		 {
			System.out.println("Digite o sal�rio do habitante: ");
			salario = leia.nextDouble();
			System.out.println("Digite o n�mero do de filhos do habitantes: ");
			numeroFilhos = leia.nextDouble();
			//processamento
			totalSalarios = totalSalarios + salario;
			totalFilhos = totalFilhos + numeroFilhos;
			
			if(maiorSalario <salario) 
			{
				maiorSalario = salario;
			}
			
			if(salario<=100) 
			{
				conta100++;
			}
			
		 }
		 
		mediaSalarios = (totalSalarios / HABITANTES);
		mediaNumeroFilhos = totalFilhos / HABITANTES;
		percentualPessoas100 = (conta100 / HABITANTES)*100;
		
		//saidas
		System.out.printf("\nM�dia de Salarios: ", mediaSalarios);
		System.out.printf("\nMedia de filhos: ", mediaNumeroFilhos);
		System.out.printf("\nMaior Salario: ", maiorSalario);
		System.out.printf("\nPercentual de pessoas com sal�rio at� R$100,00 : ", percentualPessoas100,"%");
		
		 
		 	

	}

}
