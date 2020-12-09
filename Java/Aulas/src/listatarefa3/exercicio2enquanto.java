package listatarefa3;

import java.util.Scanner;

public class exercicio2enquanto {
	
	public static void main(String[] args) {
		/*
		 * 2- Obtenha um número digitado pelo usuário e repita a operação de 
		 * multiplicar ele por três  
		 * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
		 * deveremos observar na tela a seguinte sequência: 5 15 45 135.
		 */
		Scanner leia = new Scanner(System.in);
		double usuarioNumero=0;
		
		System.out.print("Digite um numero: ");
		usuarioNumero = leia.nextDouble();
		
		while (usuarioNumero<100) {
			System.out.print("\nMutiplicando: " +usuarioNumero);
		
			usuarioNumero = usuarioNumero * 3;
		}
		
	}

}
