programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO = 2
		caracter menu, opcao
		real conta, cpf, debito=0.0, saldo=0.0,saldoTotal=0.0, credito=0.0, creditoMovimentacao=0.0, creditoSoma=0.0, total=0.0
		inteiro vetor[2], x=0,diaAniversario ,diaAtual
		
		
		escreva("==================================")
		escreva("\n    SEJA BEM VINDO AO BANCO G8\n")
		escreva("==================================\n")
		escreva("\nDigite o número da sua conta: ")
		leia(conta)
		escreva("\nDigite seu CPF(sem os pontos): ")
		leia(cpf)
		escreva("\nOlá senhor(a) o saldo atual da sua conta é de: 0.00 R$")
		escreva("\nDigite a conta que deseja acessar")
		escreva("\n1 - Para Conta Poupança")
		escreva("\n2 - Para Conta Especial")
		escreva("\n3 - Para Conta Univertária")
		escreva("\n4 - Para Conta Empresa")
		escreva("\nDigite de acordo com o número que deseja: ")
		leia(menu)
		se(menu == '1')
		{
			 escreva("\nData de aniversário:")
            	 leia(diaAniversario)
           	 escreva("Digite o dia de hoje:")
           	 leia(diaAtual)
			para(x=0;x<TAMANHO;x++)
			{
			se(diaAniversario == diaAtual)
            	{
            		escreva("\nQuanto você deseja depositar? ")
            		leia(credito)
            		escreva("Feliz Aniversário, você recebeu um acrescimo de 0,5% na sua conta!!!")
            		creditoSoma = credito * (0.5 / 100)
            		credito = credito + creditoSoma
            		escreva("\nSeu credito agora  de:",credito)
               }
            	senao
            	{
            		escreva("\nQuanto você deseja depositar? ")
            		leia(credito)
            		escreva("\nSeu credito agora  de:",credito)
            		
            	}
            	
            	se(credito<=0){
            	 	escreva("\nSaldo insuficiente!")
            	 	pare
           	 }
           	 para(x=0;x<TAMANHO;x++)
				{
				escreva("\nDigite [1] para debito")
				escreva("\nDigite [2] para credito: ")
				leia(opcao)
				
				se(opcao == '1')
				{
				escreva("\nDigite o débito da movimentação: ")
				leia(debito)
					se(debito>credito ou debito<0)
					{
						escreva("Transação não autorizada, ", debito, ", ", credito )
						debito=0
					}
					senao
					{
						saldo = credito - debito
						//vetor[x]= saldo					
					}
					
				}
				senao se (opcao == '2')
				{	
					escreva("\nDigite o credito da movimentação: ")
					leia(creditoMovimentacao)
					se(creditoMovimentacao>0)
					{	
						saldo = credito + creditoMovimentacao
						saldoTotal += saldo
						credito = 0
						
						//vetor[x]= saldo
					}
					senao
					{
						escreva("Transação não autorizada")
						credito=0					
					}
				}	
					escreva("\nO total da transação foi: ",saldoTotal," R$")
				}		
		}
		}
		
		senao se(menu == '2')
		{
			
	
			
			para(x=0;x<TAMANHO;x++)
			{
				escreva("\nDigite [1] para debito")
				escreva("\nDigite [2] para credito: ")
				leia(opcao)
				
				se(opcao == '1')
				{
				escreva("\nDigite o débito da movimentação: ")
				leia(debito)
					se(debito>saldo ou debito<0)
					{
						escreva("Transação não autorizada, ", debito, ", ", credito)
						debito=0
					}
					senao
					{
						saldo = saldo - debito
						vetor[x]= saldo					
					}
					
				}
				senao se (opcao == '2')
				{	
					escreva("\nDigite o credito da movimenteção: ")
					leia(credito)
					se(credito>0)
					{	
						saldo = saldo+credito
						vetor[x]= saldo
					}
					senao
					{
						escreva("Transação não autorizada, ", debito, ", ", credito )
						credito=0					
					}
				}	
				escreva("\nO total da transação foi: ",saldo," R$")
				escreva("\n")
			}
		}
		senao se(menu == '3')
		{
			para(x=0;x<TAMANHO;x++)
			{
				escreva("\nDigite [1] para debito")
				escreva("\nDigite [2] para credito: ")
				leia(opcao)
				
				se(opcao == '1')
				{
				escreva("\nDigite o débito da movimentação: ")
				leia(debito)
					se(debito>saldo ou debito<0)
					{
						escreva("Transação não autorizada")
						debito=0
					}
					senao
					{
						saldo = saldo - debito
						vetor[x]= saldo					
					}
					
				}
				senao se (opcao == '2')
				{	
					escreva("\nDigite o credito da movimenteção: ")
					leia(credito)
					se(credito>0)
					{	
						saldo = saldo+credito
						vetor[x]= saldo
					}
					senao
					{
						escreva("Transação não autorizada")
						credito=0					
					}
				}	
				escreva("\nO total da transação foi: ",saldo," R$")
				escreva("\n")
			}
		}
		senao se(menu == '4')
		{
			para(x=0;x<TAMANHO;x++)
			{
				escreva("\nDigite [1] para debito")
				escreva("\nDigite [2] para credito: ")
				leia(opcao)
				
				se(opcao == '1')
				{
				escreva("\nDigite o débito da movimentação: ")
				leia(debito)
					se(debito>saldo ou debito<0)
					{
						escreva("Transação não autorizada")
						debito=0
					}
					senao
					{
						saldo = saldo - debito
						vetor[x]= saldo					
					}
					
				}
				senao se (opcao == '2')
				{	
					escreva("\nDigite o credito da movimenteção: ")
					leia(credito)
					se(credito>0)
					{	
						saldo = saldo+credito
						vetor[x]= saldo
					}
					senao
					{
						escreva("Transação não autorizada")
						credito=0					
					}
				}	
				escreva("\nO total da transação foi: ",saldo," R$")
				escreva("\n")
			}
		}	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2848; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */