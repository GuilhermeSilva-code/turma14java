programa
{
	
	funcao inicio()
	{
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, 
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
		 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
		Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */

		 real preco=100
		 real precoDesconto
		 real desconto=0
		 real precoJuros
		 real juros=0.1
		 inteiro condPagamento=0
		 escreva("BEM VINDO A RENNER")
		 escreva("\nO valor da camiseta é de R$100")
		 escreva("\n[1] À vista em dinheiro ou cheque, recebe 20% de desconto")
		 escreva("\n[2] À vista no cartão de crédito, recebe 15% de desconto")
		 escreva("\n[3] Em duas vezes, preço normal de etiqueta sem juros")
		 escreva("\n[4] Em três vezes, preço normal de etiqueta mais juros de 10%")
		 escreva("\nO preço de produto é " ,preco)
		 escreva("\nDigite [1],[2],[3] ou [4] para forma de pagamento: ")
		 leia(condPagamento)
		

		 se (condPagamento == 1){
		 	desconto = preco * 0.2
		 	precoDesconto = preco - desconto
		 	escreva("O preço da camiseta ficou de R$", precoDesconto)
		 }
		 senao se(condPagamento == 2){
		 	desconto = preco * 0.15
		 	precoDesconto = preco - desconto
		 	escreva("O preço da camiseta ficou ", precoDesconto)
		 }
		 senao se(condPagamento == 3){
		 	escreva("O preço da camiseta ficou R$", preco)
		 }
		 senao se(condPagamento == 4){
		 	juros = preco * 0.10
		 	precoJuros = preco + juros
		 	escreva("O preço do produto ficou R$", precoJuros)
		 }
		 senao{
		 	escreva("Você digitou um número inválido!")
		 }
		 	
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1705; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */