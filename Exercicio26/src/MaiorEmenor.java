//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
//- O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais

import java.util.Scanner;

public class MaiorEmenor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int primeiroNumero = 0;
		int segundoNumero = 0;

		while (primeiroNumero > segundoNumero || segundoNumero > primeiroNumero
				|| segundoNumero == primeiroNumero) {

			System.out.println("Escreva o primeiro número");

			primeiroNumero = leia.nextInt();

			System.out.println("Escreva o segundo número");

			segundoNumero = leia.nextInt();

			if (primeiroNumero > segundoNumero) {
				System.out.println("O valor " + primeiroNumero + " é maior");
			}

			else if (segundoNumero > primeiroNumero) {
				System.out.println("O valor " + segundoNumero + " é maior");
			}

			else {
				System.out.println("Os valores são iguais");

			}
		}
	}
}



