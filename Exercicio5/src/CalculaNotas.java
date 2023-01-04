import java.util.Scanner;


//5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5


public class CalculaNotas {

public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	System.out.println("------------------------");
	System.out.println("   MÉDIA DAS NOTAS");
	System.out.println("------------------------");
	
	System.out.println("Informe a diciplina");
	
	String disciplina = leia.nextLine();
	System.out.println("Digite a primeira nota");
	float primeiraNota = leia.nextFloat();
	
	System.out.println("Digite a segunda nota");
	float segundaNota = leia.nextFloat();
	float media = (primeiraNota + segundaNota)/2;
	
	System.out.println("A média das suas notas em "+  disciplina 
	+" é "+ media);
  

	leia.close();
	
	
	
	
	
	






}






}
