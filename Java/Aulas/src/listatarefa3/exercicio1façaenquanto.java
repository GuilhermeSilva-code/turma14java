package listatarefa3;

public class exercicio1fa�aenquanto {
	
	public static void main(String[] args) {
		
		/*
		 *1) Fa�a um programa que mostre uma contagem na tela de 233 a 456, 
		 * s� que contando de 3 em 3 quando 
		 * estiver entre 300 e 400 e de 5 em 5 quando n�o estiver.
		 */
		
		for(int contador=233;contador<=456;contador+=5) {
			
			if(contador >=300 && contador <=400) {
		 		System.out.printf("\nO numero �: ", contador);
		 		contador -=2;
			} else {
				System.out.print("\nO numero �: "+ contador);
			}
				
		}
	}

}
