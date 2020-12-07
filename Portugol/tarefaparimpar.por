programa
{
	
	funcao inicio()
	{
		/*
		 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
		 * e se é positivo ou negativo.
		 */
		
		inteiro numeroDigitado
		escreva("digite um numero positivo inteiro:")
		leia(numeroDigitado)
		se (numeroDigitado < 0)
		{
			escreva("Numero negativo, tente novamente!!")
		}
		senao se (numeroDigitado ==0){
			escreva("Vc digitou o zero!!")
		}
		senao
		{
			se ( (numeroDigitado%2) == 0 )
			{
				escreva("O numero digitado é par!!")
			}
			senao
			{
				escreva("O numero digitado é impar!!")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */