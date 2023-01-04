import java.util.Scanner;

public class BemVindo {
 
//	2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
//	vindas para ela:
//	Ex:
//	Qual é o seu nome? João da Silva
//	Olá João da Silva, é um prazer te conhecer!

	
	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("   BEM-VINDO(A)");
		System.out.println("--------------------");
	
		System.out.println("Qual o seu nome?");	;	
	 
		
		String nome = leia.nextLine();  
	         
                System.out.println("Olá"+ nome + ", é um prazer te conhecer! ");

		
	
	
	
	}
	
	
	
}
