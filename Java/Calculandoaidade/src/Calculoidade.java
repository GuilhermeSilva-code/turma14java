import java.util.Scanner;

public class 	Calculoidade{
	
		 public static void main(String[] args) {
			 Scanner leia = new Scanner (System.in);
		int ano, mes, dia, calculo;
		  
		 System.out.println("Digite sua idade em anos");
		 ano = leia.nextInt();
		 System.out.println("Digite o número do mês");
		 mes = leia.nextInt();
		 System.out.println("Digite o dia");
		 dia = leia.nextInt();
		 calculo = (ano * 365) + (mes * 30) + dia;       
		 System.out.println("Sua idade em dia é: " + calculo);
		      }
		 }


