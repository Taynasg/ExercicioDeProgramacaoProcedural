import java.util.Scanner;

//	25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//	Analise seus comprimentos e diga se é possível formar um triângulo com essas
//	retas. Matematicamente, para três segmentos formarem um triângulo, 
//	o comprimento de cada lado deve ser menor que a soma dos outros dois.

public class Triangulos {

	public static void main(String[] args) {

		// Para formar um triângulo um dos lado deve ser maior que a diferença
		// dos outros dois lados. E menor que a soma deles

		// | b - c | < a < b + c
		// | a - c | < b < a + c
		// | a - b | < c < a + b

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro lado");

		double lado1 = leia.nextInt();

		System.out.println("Digite o segundo lado");

		double lado2 = leia.nextInt();

		System.out.println("Digite o terceiro lado");

		double lado3 = leia.nextInt();

		if ((lado2 - lado3) < lado1 && lado1 < (lado2 + lado3) &&

				(lado3 - lado1 < lado2) && lado2 < (lado1 + lado3) &&

				(lado1 - lado2) < lado3 && lado3 < (lado1 + lado2)) {

			System.out.println("Você pode formar com essas medidas");

		} else {
			System.out.println("Não é possível formar um triângulo com essas medidas");
		}

	}
}
