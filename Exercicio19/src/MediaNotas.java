import java.util.Scanner;

public class MediaNotas {

//	19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//	média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//	não um bom aproveitamento (se ficou acima da média 7.0).	

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("  MÉDIA DAS NOTAS");
		System.out.println("-------------------");

		System.out.println("Informe o seu nome");
		String nome = leia.nextLine();

		System.out.println("Informe sua primeira nota");
		float primeiraNota = leia.nextFloat();

		System.out.println("Informe sua segunda nota");
		float segundaNota = leia.nextFloat();

		float media = (primeiraNota + segundaNota) / 2;
		System.out.println("O(a) aluno(a) " + nome + " está com a média " + media);

		if (media >= 7 && media <= 10)
			System.out.println("Aprovado, teve um bom aproveitamento!");

		else if ((media >= 5) && (media <= 6))
			System.out.println("Em recuperação, estude mais");

		else {

			System.out.println("Reprovado");

			leia.close();

		}
	}
}