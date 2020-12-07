import java.util.Scanner;

public class Temperatura2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		double valorCelsius, valorFahrenheit;
		
		System.out.println("Digite a temperatura aqui: ");
		valorCelsius = leia.nextDouble();
		
		valorFahrenheit = ( valorCelsius * 9/5) + 32;
		
		System.out.println("A temperatura em Fahrenheit é:" +valorFahrenheit);
		

	}

}
