package br.com.generation.lista3;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0,menor = 0, maior = 0;
		
		System.out.println("Digite as idades. ");
		System.out.println("-99 para sair");
		
		while (idade != -99) {
			idade = scan.nextInt();
			if (idade < 21 && idade!=-99) {

				menor += 1;
			
			}
			else if (idade > 50) {
				
				maior += 1;
			}
			
		}
		System.out.printf("Quantidade de pessoas com menos de 21 anos: %d",menor);
		System.out.printf("\nQuantidade de pessoas com mais de 50 anos: %d",maior);
		
		scan.close();
	}

}
