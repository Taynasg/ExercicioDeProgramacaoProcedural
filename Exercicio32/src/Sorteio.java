import java.util.Random;
import java.util.Scanner;

//32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 
//e o jogador vai tentar descobrir qual foi o valor sorteado.

public class Sorteio {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean acertou = false;
		int tentativas = 10;
		int segredo = sorteia.nextInt(5) + 1;
		long chute = 0;

		while (tentativas > 0 && acertou == false)
			;
		System.out.println("Qual seu chute?");
		chute = scanner.nextLong();
		if (segredo == chute) {
			System.out.println("Parabéns! Você acertou! ");
			acertou = true;
		
	}else if(chute<segredo) {
		--tentativas;
		System.out.println();
		
		
		
		
		
	}
}