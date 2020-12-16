package projetoBanco;

import java.util.Random;

public class testeBanco{

	public static void main(String[] args){
		int tipoMovimento[] = new int[10];
		int aniversario[] = new int[40];
		int qualquer;
		Random aleatorio = new Random();
		
		
		for (int x=0; x<10;x++){
			tipoMovimento[x] = x+1;
			System.out.println("Dia " +tipoMovimento[x]);
			
			aniversario[x] = aleatorio.nextInt(31)+1;
			qualquer = aniversario[x];
		}
		System.out.println("\nQualquer " +aleatorio[qualquer]);
	}
	eu == vc == nós == sei ká
			System.out.println("Geral chorando!!!");
}
