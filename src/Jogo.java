import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		PrintStream show = System.out;
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int escolhaComputador;
		int escolhaUsuario;
		
		show.println("Ol�, digite seu nome: ");
		String nome = scan.nextLine();
		show.println("Prazer em conhecelo " + nome + "!");
		show.println(nome + " vo�� quer jogar comigo");
		show.println("\nInforme o numero da sua op��o.\n1 -> Sim\n2 -> N�o");
		opcao = scan.nextInt();
		
		if(opcao == 2) {
			show.println("Que pena! mas tudo bem fica para a pr�xima");
		}else if(opcao == 1) {
			show.println("ok! o jogo � assim...");
			show.println("eu vou escolher um numero de 0 a 10");
			show.println("Mas n�o vou falar pra vo�e qual �");
			show.println("Se vo�e conseguir advinhar qual numero eu escolhi");
			show.println("Voc� sera o vencedor");
		}
		escolhaComputador = gerador.nextInt(11);
		
		show.println("ok " + nome + "Eu ja escolhi!");
		show.println("Agora tente advinhar");
		
		do {
			escolhaUsuario = scan.nextInt();
			if(escolhaUsuario != escolhaComputador) {
				show.println("Resposta Errada!");
			}else {
				show.println("Parab�ns vo�� acertou");
			}
		}while(escolhaComputador != escolhaUsuario);
		
	}

}
