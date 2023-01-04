//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m2. O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m2 = TERRENO POPULAR
//- Entre 100m2 e 500m2 = TERRENO MASTER
//- Acima de 500m2 = TERRENO VIP

import java.util.Scanner;

public class Terreno {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o comprimento do terreno em metros:");

		float comprimento = leia.nextInt();

		if (comprimento <= 0) {
			System.out.println("Medida inválida! Por favor tente novamente");
			int comprimento1 = leia.nextInt();

		} else {

			System.out.println("Informe a largura do terreno em metros:");
			float largura = leia.nextInt();

			if (largura <= 0) {
				System.out.println("Medida inválida! Por favor tente novamente");
				int largura1 = leia.nextInt();

			} else {

				float tamanho = comprimento * largura;

				if ((tamanho > 0) && (tamanho < 100.0)) {
					System.out.println("Este terreno tem " + tamanho + " metro(s) " + "e é POPULAR");
				} else if ((tamanho >= 100.0) && (tamanho <= 500.)) {
					System.out.println("Este terreno tem " + tamanho + " metro(s) " + "e é MASTER");

				} else {
					System.out.println("Este terreno tem " + tamanho + " metro(s) " + "e é VIP");
				}

				leia.close();
			}
		}
	}
}
