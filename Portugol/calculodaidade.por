programa
{
	
	funcao inicio()
	{
		cadeia nomePessoa
		inteiro anoPessoa
		inteiro idade
		real valorC
		real valorF

		escreva("Digite o seu ano de nascimento:")

		leia(anoPessoa)

		idade = 2020 - anoPessoa //Calculo da Idade
		
		escreva("Digite o seu nome:")

		leia(nomePessoa) //Pegando o nome da pessoa

		escreva("OII ",+nomePessoa+" estamos na Generation")

		escreva("\nSua idade é aproximadamente: "+idade)

		escreva("\nDigite a tempuratura aqui:")

		leia(valorC)

		valorF = ( valorC * 9/5) + 32

		escreva("Temperatura em Fahrenheit é:"+valorF)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */