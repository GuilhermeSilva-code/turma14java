programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 *1) Faça um programa que mostre uma contagem na tela de 233 a 456, 
		 * só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		 */
		 

		 para (inteiro contador=233;contador<=456;contador+=5){
		 	

		 	se (contador >=300 e contador <=400){
		 		escreva("\nO numero é: ", contador)
		 		contador-=2
		 	}
		 	senao{
		 		escreva("\nO numero é: ", contador)
		 	}
		 }

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */