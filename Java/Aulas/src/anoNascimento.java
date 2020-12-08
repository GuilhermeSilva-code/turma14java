import java.util.Scanner;

public class anoNascimento {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anoNascimento, idade;
		
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = 2020 - anoNascimento;
		System.out.println(Sua);
		
		return;
		
		
		
	}
	static void pula()
	{
		System.out.println();
		
		
	}
	
	static void linha() {
		System.out.println("____________________________________________________");
}
	
	public static void linhaTamanho(int tamanho) {
		
		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}
	}
	
}
