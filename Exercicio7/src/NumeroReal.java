
//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

import java.util.Scanner;

public class NumeroReal {

public static void main(String[] args) {
	Scanner leia = new  Scanner(System.in);
	
	System.out.println("----------------------");
	System.out.println("VALIDAÇÃO DO NÚMERO REAL");
	System.out.println("----------------------");
	
	System.out.println("Informe o número");
	
	double numero = leia.nextDouble();
	double dobro = numero*2;
	double tercaParte = numero/3;
	
	System.out.println("O dobro do número " + numero + " é " 
	+ dobro);
	System.out.println("A terça parte do número " + numero + " é " 
		+ tercaParte);
	
	leia.close();
}

}
