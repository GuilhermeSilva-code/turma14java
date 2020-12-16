package loja;
import java.util.Scanner;
public class CadLoja {
	public static void main(String[] args)
	{
		//variveis
		Scanner leia = new Scanner(System.in);
		char opcao = 0;
		int opcaoMenu;
		String codigos[] = new String[10];
		String produtos[] = {"CARRO", "BONECA", "QUEBRA-CABEÇA", "PEÃO", "AVIÃO", "NAVE-ESPACIAL", "COZINHA", "CASINHA-DE-BONECA", "PIPA", "BICICLETA"}; 
		double precoUnitarios[] = {120, 150, 30, 15, 230, 100, 140, 200, 3, 460};
		int estoque[] = new int[10];
			
		linha();
		System.out.println("Loja POPDinamics");
		System.out.println("A diversão a um palmo de distancia!!!");
		linha();
		System.out.println();
		// menu inicial
		do 
		{
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		System.out.print("DIGITE A OPÇÃO: ");
		opcaoMenu = leia.next().charAt(0);
		
		switch (opcaoMenu)
		{
			
				
			
			case '1':
			{
				System.out.print("Por favor informe o seu nome: ");
				String nomeCliente = leia.next().toUpperCase();
				System.out.print("Você de define como M-masculino, F-feminino ou O-outro :");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("Seja bem-vind%s loja %s!!!",voltaGenero(generoCliente),nomeCliente);
					System.out.print("Continuar S/N: ");
					opcao = leia.next().toUpperCase().charAt(0);
				
			}
			case '2':
			{
				System.out.println("WIP");  // work in progress
				System.out.print("Continuar S/N: ");
				opcao = leia.next().toUpperCase().charAt(0);
			}
			case '3':
			{
				while (opcao == 'S')
				{
			}
				System.out.println("Volte sempre, adoramos sua visita!!!");
				break;
		}
		
				
	}
	
	
	public static void linha()
	 {
		 for(int x = 0;x<80;x++)
		 {
			 System.out.print("=");
		 }
			 
	 }

	public static String voltaGenero(char generoCliente) {
		
		String tipo;
		if (generoCliente == 'M')
		{
			tipo = "o";
		}
		else if (generoCliente == 'F')
		{
			tipo = "a";
		}
		else if (generoCliente == 'O')
		{
			tipo = "x";
		}
		else
		{
			tipo = "*";
		}
			
		
		return tipo;
	
	}
	
}
