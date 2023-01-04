
import java.util.Scanner;

public class Remuneracao {	

//	3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no

//	final uma mensagem.
//	Ex:
//	Nome do Funcionário: Maria do Carmo
//	Salário: 1850,45
//	O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		System.out.println("Informe seu nome");	
		String nome = leia.nextLine(); 
		System.out.println("Informe o seu salário");
		Float salario = leia.nextFloat();
		leia.nextLine();
		System.out.println("Informe o dia");
		String dia = leia.nextLine();
		
		System.out.println("O(a) funcionário(a) " + nome + " recebe um salário " + "de " 
		+ "R$ "+ salario + " no dia " + dia + " de todo mês" +".");
		
	
	   leia.close();
	
	}
	
}
