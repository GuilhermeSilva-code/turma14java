import java.util.Scanner;

public class CelsiusparaFarenheint {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		/*
		 * real valorCelsius
		real valorFahrenheit

		escreva("\nDigite a tempuratura aqui:")

		leia(valorFahrenheit)
		
		valorCelsius = (valorFahrenheit - 32) * 5/9 

		escreva("\nA temperatura em Celsius �:"+Matematica.arredondar(valorCelsius,1)+ "�C")
		 */
		
		double valorCelsius, valorFahrenheit;
		
		System.out.println("Digite a temperatura aqui: ");
		valorFahrenheit = leia.nextDouble();
		
		valorCelsius = (valorFahrenheit - 32) * 5/9;
		
		System.out.printf("A temperatura em Celsius �:",Math.round(2), +valorCelsius+ "�C");
		
		
	}

}
