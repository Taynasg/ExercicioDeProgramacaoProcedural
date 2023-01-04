//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.

import java.util.Scanner;

public class AnoNascimento {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("    VOCÊ PODE VOTAR?");
		System.out.println("--------------------------");

		System.out.println("Escreva o seu ano de nascimento ");

		int anoNascimento = leia.nextInt();

		int anoAtual = 2022;

		int Calculo = anoAtual - anoNascimento;

		System.out.println("Sua idade é " + Calculo);

		if (Calculo >= 16) {

			System.out.println("Parabéns! Você já pode votar!");
		}else{
			System.out.println("Infelizmente você não pode votar");
			leia.close();
		}
	}
}
