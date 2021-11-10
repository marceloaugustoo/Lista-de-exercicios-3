package br.com.generation.lista3;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		
		int sex,idade,psico,i = 0,calmas = 0,mnerv = 0,hagre = 0,outrc = 0,qnerv = 0,adolecalmo = 0;
		Scanner scan = new Scanner(System.in);
		
		while (i<2) {
			
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			System.out.println("Digite o sexo (1- feminino, 2- masculino, 3- outro) :");
			sex = scan.nextInt();
			
			System.out.println("Digite a opção (1- calmo(a), 2- nervoso(a),3- agressivo(a):");
			psico = scan.nextInt();
			
			if (psico == 1) {
				calmas ++;
			}
			if (sex == 1 && psico == 2) {
				mnerv ++;
			}
			if (sex == 2 && psico == 3) {
				hagre ++;
			}
			if (sex == 3 && psico == 1) {
				outrc ++;
			}
			if (idade > 40 && psico == 2) {
				qnerv ++;
			}
			if (idade < 18 && psico == 1) {
				adolecalmo ++;
			}
			
			i++;
		}
		
		System.out.println("Numero de pessoas calmas: " + calmas);
		System.out.println("\nNumero de mulheres nervosas: " + mnerv);
		System.out.println("\nNumero de homens agressivos: " + hagre);
		System.out.println("\nNumero de outros calmos: " + outrc);
		System.out.println("\nNumero de pessoas nervosas com mais de 40 anos: " + qnerv);
		System.out.println("\nNumero de pessoas calmas com menos de 18 anos: " + adolecalmo);
		
		scan.close();
	}

}
