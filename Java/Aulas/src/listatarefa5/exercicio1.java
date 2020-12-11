package listatarefa5;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/*
		 * 	Elabore um programa que calcule o que deve ser pago por um produto, 
		 * 	considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
		 * 	Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
		 * 	escolhida e efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */
		Scanner leia = new Scanner(System.in);
		double preco=100, precoDesconto, desconto=0, precoJuros, juros=0.1;
		int condPagamento=0;
		 
		 
		 System.out.print("BEM VINDO A RENNER");
		 System.out.print("\nO valor da camiseta é de R$" +preco);
		 System.out.print("\n[1] À vista em dinheiro ou cheque, recebe 20% de desconto");
		 System.out.print("\n[2] À vista no cartão de crédito, recebe 15% de desconto");
		 System.out.print("\n[3] Em duas vezes, preço normal de etiqueta sem juros");
		 System.out.print("\n[4] Em três vezes, preço normal de etiqueta mais juros de 10%");
		 System.out.print("\nO preço de produto é " +preco);
		 System.out.print("\nDigite [1],[2],[3] ou [4] para forma de pagamento: ");
		 condPagamento = leia.nextInt();
		 
		 if (condPagamento == 1){
			 	desconto = preco * 0.2;
			 	precoDesconto = preco - desconto;
			 	System.out.println("O preço da camiseta ficou de R$"+precoDesconto);
			 }
		 else if(condPagamento == 2){
			 	desconto = preco * 0.15;
			 	precoDesconto = preco - desconto;
			 	System.out.println("O preço da camiseta ficou "+ precoDesconto);
			 }
		 else if(condPagamento == 3){
			 	System.out.println("O preço da camiseta ficou R$"+ preco);
			 }
		 else if(condPagamento == 4){
			 	juros = preco * 0.10;
			 	precoJuros = preco + juros;
			 	System.out.println("O preço do produto ficou R$"+ precoJuros);
			 }
		 else{
			 	System.out.println("Você digitou um número inválido!");
			 }

	}

}
