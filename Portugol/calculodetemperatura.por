programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real valorCelsius
		real valorFahrenheit

		escreva("\nDigite a tempuratura aqui:")

		leia(valorFahrenheit)
		
		valorCelsius = (valorFahrenheit - 32) * 5/9 

		escreva("\nA temperatura em Celsius é:"+Matematica.arredondar(valorCelsius,1)+ "ºC")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */