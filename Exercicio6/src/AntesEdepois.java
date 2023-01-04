import java.util.Scanner;

public class AntesEdepois {
	
//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//	sucessor.
//	Ex:
//	Digite um número: 9
//	O antecessor de 9 é 8
//	O sucessor de 9 é 10
	
	

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("--------------------------");
		System.out.println("  ANTECESSOR E SUCESSOR ");
		System.out.println("---------------------------");
		
		
		System.out.println("Informe um número");
		int numero = leia.nextInt();
		int antecessor = numero-1;
		int sucessor = numero+1;
		System.out.println("O antecessor do número " + numero + " é "
		+ antecessor + " e o sucessor é "	+ sucessor	);
	
	}
	
	
	
}
