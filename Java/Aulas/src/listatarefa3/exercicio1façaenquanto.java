package listatarefa3;

public class exercicio1façaenquanto {
	
	public static void main(String[] args) {
		
		/*
		 *1) Faça um programa que mostre uma contagem na tela de 233 a 456, 
		 * só que contando de 3 em 3 quando 
		 * estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		 */
		
		for(int contador=233;contador<=456;contador+=5) {
			
			if(contador >=300 && contador <=400) {
		 		System.out.printf("\nO numero é: ", contador);
		 		contador -=2;
			} else {
				System.out.print("\nO numero é: "+ contador);
			}
				
		}
	}

}
