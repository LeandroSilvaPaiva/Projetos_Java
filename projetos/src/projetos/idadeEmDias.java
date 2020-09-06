package idadeEmDias;
import java.util.Scanner;
public class idadeEmDias
{
	public static void main(String[] args)
	{
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
*/
		int anos, meses, dias, totalDias;
		Scanner kb = new Scanner(System.in); // criar o teclado
		System.out.println("Digite quantos anos você tem: ");
		anos = kb.nextInt();
		System.out.println("Digites os meses: ");
		meses = kb.nextInt();
		System.out.println("Digite os dias: ");
		dias = kb.nextInt();
		//processo
		totalDias = anos*365;
		totalDias =totalDias + (meses*30);
		totalDias = totalDias + dias;
		
		System.out.printf("Sua idade em dias é de %d", totalDias);
		
		
	}
	

}
