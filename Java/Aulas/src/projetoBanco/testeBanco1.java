package banco;
import java.util.Scanner;
public class BancoExemplo {
	public static void main(String[] args)
	{
		
		Scanner ler = new Scanner(System.in);
		char leiaMenu;
		int menu;
		String nome[]={"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho",
				"Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito","Fernanda Barbosa Ferraz",
				"Francisco José Pires","Gabriel Enrique Cabral Silva","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","Gilson Amorim de Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
				"Heloisa Beatriz de Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão",
				"Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
				"Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"};
		char sexo [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		double movimento[] = new double[10];
		char tipoMovimento[] = new char[10];
		double saldoConta [] = new double [40];
		int conta [] = new int [40];
		int contaUm = 0, numeroConta, debCred;
		double saldo = 0.0, debito = 0.0, credito = 0.0, creditoTotal = 0.0, debitoTotal = 0.0;
		
		
		linha();
		System.out.println();
		System.out.println("                    █     BEM VINDO AO BANCO-G8    █");
		System.out.println("                    █     AQUI SEU DINHEIRO RENDE  █");
		linha();
		
		System.out.print("\nInsira o número da sua conta: ");
		numeroConta = ler.nextInt();
		if(numeroConta == 1)
		{
			System.out.println("CONTA POUPANÇA");
			break;
		}
		else if(numeroConta == 2)
		{
				System.out.println("CONTA CORRENTE");
				break;
		}
				else if(numeroConta == 3) {
					System.out.println("CONTA ESPECIAL");
					break;
				}
				else if(numeroConta == 4) {
					System.out.println("CONTA EMPRESARIAL");
					break;
				}
				else if(numeroConta == 5) {
					System.out.println("CONTA UNIVERSITÁRIA");
					break;
				}
				else {
					System.out.println("Você não está cadastrado no banco!");
					break;
				}
				/*System.out.println("\nSeu saldo atual é de R$ " + saldo);
				for(int x = 0; x < 10; x++) {
					System.out.printf("Dia %d \n", x+1);
					System.out.println("[1] - CRÉDITO\n[2] - DÉBITO");
					System.out.println("QUAL A OPÇÃO DESEJADA?");
					debCred = ler.nextInt();
					if(debCred == 1) {
						System.out.println("QUAL O VALOR?");
						credito = ler.nextDouble();
						creditoTotal += credito;
						System.out.println("SALDO TOTAL: " + creditoTotal);
					}
					else if(debCred == 2) {
						System.out.println("QUAL O VALOR?");
						debito = ler.nextDouble();
						debitoTotal = creditoTotal - debito;
						if(debitoTotal < 0) {
							System.out.println("\nTRANSAÇÃO INDISPONÍVEL.\n");
						}
						else {
						creditoTotal -= debito;
						System.out.println("SALDO TOTAL: " + creditoTotal);
						}
					}
					else {
						System.out.println("VALOR INVÁLIDO.");
					}
				}*/
			/*case 2:
				break;
			case 3:
				System.out.println("Volte sempre! :D");
				break;*/
		}
	
		//FUNCAO LINHA
		public static void linha(){
			int valor = 80;
			for(int x=0;x<valor;x++) {
				System.out.print("█");
			}
		}
		//FIM FUNCAO LINHA
}