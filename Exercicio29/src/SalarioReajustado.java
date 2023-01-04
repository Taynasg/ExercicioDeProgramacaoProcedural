//29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
//- Até 3 anos de empresa: aumento de 3%
//- entre 3 e 10 anos: aumento de 12.5%
//- 10 anos ou mais: aumento de 20%

import java.util.Scanner;

public class SalarioReajustado {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu nome");
		String nome = leia.nextLine();

		System.out.println("Informe seu salário");
		double salario = leia.nextDouble();

		if (salario >= 0) {
			System.out.println("Informação invalida! Por favor tente novamente");
		}

		else {

			System.out.println("Informe há quantos anos você trabalha " + "na empresa ");
			int anos = leia.nextInt();

			double reajuste1 = salario * 1.03;
			double reajuste2 = salario * 1.125;
			double reajuste3 = salario * 1.20;
			
			+ String.format("%.2f",salario);
		}
	leia.close();
	}


}
}
