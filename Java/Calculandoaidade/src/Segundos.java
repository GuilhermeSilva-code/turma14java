import java.util.Scanner;

public class Segundos {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		  int eventoSegundos = 0, horas, segundos = 0, minuto=0;
		
		System.out.println("Quanto dura um evento em segundos: ");
		eventoSegundos = leia.nextInt();
			horas = (eventoSegundos/ 3600);	
		System.out.println("hora(s): "+ horas);
			minuto = ((eventoSegundos % 3600)/ 60);
		System.out.println("Minuto(s): "+ minuto);
			segundos = (eventoSegundos % 3600 % 60);
		System.out.println("Segundo(s): "+ segundos);
		
				
		
	}

}
