programa
{

    funcao inicio()
    {

        //variaveis
        const inteiro TAMANHO = 10
        real vetor[TAMANHO], dinheiroAcumulado=1000.00, credito=0, debito=0
        real total=0
        real saldo=0
        inteiro = x
        inteiro conta
        real cpf
        caracter acesso
        inteiro diaAniversario
        inteiro diaAtual
        real creditoSoma
    
            escreva("\n  SEJA BEM VINDO AO BANCO G8\n")
            escreva("\nO número da conta é: ")
            leia(conta)
            escreva("\nSeu saldo atual: 0.00 R$")
            escreva("\nO seu CPF é: " )
            leia(cpf)
            escreva("\nData de aniversário:")
            leia(diaAniversario)
            escreva("Digite o dia de hoje:")
            leia(diaAtual)
            
            

            para(x=1;x<=TAMANHO;x++){
            escreva("\nDigite o credito do dia ",x,": ")
            leia(credito)
            
            escreva("Digite o débito do dia ",x,": ")
            leia(debito)

            se(diaAniversario == diaAtual){
            	escreva("Feliz Aniversário, você recebeu um acrescimo de 0,5% na sua conta!!!")
            	creditoSoma = credito * (0.5 / 100)
            	credito = credito + creditoSoma
            	escreva("\nSeu credito agora  de:",credito)
            }
      
            total = credito - debito
            
            se(total<=0){
            	 escreva("\nSaldo insuficiente!")
            	 pare
            } senao {
            	

            escreva("\nDeseja continuar?")
            escreva("\nDigite [S] para SIM")
            escreva("\nDigite [N] para NÃO")
            escreva("\nDigite a letra desejada: ")
            leia(acesso)
            se (acesso == 'S' ou acesso == 's' )
            {
			escreva("O total do dia ",x+1," foi: ",total," R$")

            }
            senao se (acesso == 'N' ou acesso == 'n')
            {
                limpa()
                escreva("\nObrigado e retorne sempre!! :D\n")
            }
            	
            }
            
            
            }
       
    }



    funcao linha()
    {
        escreva("===============================")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */