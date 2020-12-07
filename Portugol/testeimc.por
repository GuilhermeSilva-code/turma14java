programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		/*
		 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
		 * para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
		Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
		IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso
		 */

		 real peso=0
		 real altura= 0
		 real imc

		 escreva("Digite a sua altura: ")
		 leia(altura)

		 escreva("\nDigite o seu peso: ")
		 leia(peso)

		imc = peso / (altura * altura)
	

		 se (imc <= 18.5){
		 	escreva("\nSeu imc é ",mat.arredondar(imc, 0), " você está abaixo do peso!")
		 }

		 senao se (imc >= 18.6 e imc <= 25){
		 	escreva("\nSeu imc é ",mat.arredondar(imc, 0), " você está no peso normal!")
		 
		 }
		 senao se (imc >=25.1  e imc <= 30){
		 	escreva("\nSeu imc é ",mat.arredondar(imc, 0), "  você está acima do peso!")
		 	
		 	}
		senao{
			 escreva("\nSeu imc é ",mat.arredondar(imc, 0), " você está obeso!")
		 		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 */