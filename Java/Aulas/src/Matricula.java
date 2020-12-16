import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
		String[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima",
			"Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira",
			"Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
			"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
			"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior",
			"Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva",
			"Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins",
			"Verônica Navarro Almena","Gabriel Enrique Cabral Silva","Vinicius Alves Miranda"};
		char[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M',
				'M','M','M','F','F','M','F','M','M','M'};
		int matriculas[] = new int[40];
		String aluno;
		
		System.out.print("LISTA");
		System.out.printf((1),"\nMatricula: ");
		System.out.printf((2),"\nAlunos homens");
		
		do {
			
			for(int x = 0; x < 40; x++){
				matriculas[x] = "G8-"+(x+1);
			}
			for (int x = 0; x < 40; x++){
				System.out.print("%d \t%s \t%s ", matriculas[x], " - ",alunos[x], ", ", generos[x]); {
				
			}
			System.out.println("Digite a matricula do aluno: ");
				alunos = leia.next();
			for(int x = 0; x < 40; x++){
				if(alunos == matriculas[x]){
				escreva(alunos[x], " ", generos[x]);
		}
	}

}
