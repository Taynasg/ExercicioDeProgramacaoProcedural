import java.util.Scanner;

public class Somatória {

//	4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//	entre eles.
//	Ex:
//	Digite um valor: 8
//	Digite outro valor: 5
//	A soma entre 8 e 5 é igual a 13.
	
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Somatória");
		System.out.println("Digite um número");
		int primeiroNumero = leia.nextInt();
		System.out.println("Digite o segundo número");
		int segundoNumero = leia.nextInt();
		int soma = primeiroNumero+ segundoNumero;
		System.out.println("A soma de " + primeiroNumero + " e " + 
		segundoNumero + " é " + soma + ".");
		
		leia.close();
	
	
	}
}
