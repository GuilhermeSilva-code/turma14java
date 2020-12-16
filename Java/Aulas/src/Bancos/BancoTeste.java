package Bancos;
import java.util.Scanner;
public class BancoTeste {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("BANCO TESTE PARA USO");
		int conta;
		char op;
		double valor= 0.00;
		System.out.println("Digite o numero da conta: ");
		conta = leia.nextInt();
		
		contaPoupanca edpop = new contaPoupanca(14, "111.222.333.44", 15);
		contaCorrente contapobre = new contaCorrente();
		contaEspecial contarico = new contaEspecial();
		
		
		contapobre.credito(100);
		contarico.valorLimite = 10000;
	   
		
		contaEspecial processo1 = new contaEspecial(); //declarar o objeto e usar o construtor
		System.out.println("Saldo atual da conta é "+processo1.saldo);
		System.out.println("Desejar movimentar? S/N");
		op = leia.next().toUpperCase().charAt(0);
		while (op =='S')
		{
			System.out.println("Movimento a credito ou debito? [C/D]:");
			op = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
			if (op=='D')
			{
				processo1.debito(valor);
			}
			else if (op=='C')
			{
				processo1.credito(valor);
			}
			System.out.printf("Saldo atual: %.2f\n", processo1.saldo );
			System.out.println("Continua S/N:");
			op = leia.next().toUpperCase().charAt(0);
		}
						
		System.out.println("Fim do programa. Tks!!!");
		
		
		
	}
}