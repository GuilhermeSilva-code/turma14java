package listatarefa8;

import java.util.ArrayList;
import java.util.Collection;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList();
		
		Preguica preguica = new Preguica();
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();
		
		cachorro.correr();
		cachorro.som();
		
		
		cavalo.correr();
		cavalo.som();
		
		preguica.subirArvores();
		preguica.som();
		
		nomes.add("Cachorro");
		nomes.add("Cavalo");
		nomes.add("Preguiça");
		
		
		System.out.println("Contém o nome cavalo?"+nomes.contains("Cavalo"));
		System.out.println("Lista: "+nomes);
		/*System.out.println("Lista de nomes :"+nomes);
		nomes.remove("Preguiça");
		System.out.println("Lista de nomes :"+nomes);*/
			
		/*	System.out.println("Lista vazia...");
		}
		else {
			
			System.out.println("Lista de nomes :"+nomes);
		}*/
		
		
		
	}

}
