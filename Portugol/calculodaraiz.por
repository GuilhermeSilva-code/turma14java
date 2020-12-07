programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d, p1, p2

		
		escreva("Valor de  X1:")
		leia(x1)
		
		escreva("Valor de  X2:")
		leia(x2)
		
		escreva("Valor de  Y1:")
		leia(y1)
		
		escreva("Valor de  Y2:")
		leia(y2)

		p1 = (mat.potencia((x2-x1),2))
		
		p2 = (mat.potencia((y2-y1),2))
		
		d = (mat.arredondar((mat.raiz((p1 + p2),2)),2))
		
		escreva("Valor de distância é ", d)

}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */