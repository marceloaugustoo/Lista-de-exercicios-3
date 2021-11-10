package br.com.generation.lista3;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		
		int numero,soma = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite numeros para somar.");
		do {
			
			numero = scan.nextInt();
			soma += numero;
		}
		
		while(numero != 0);
		System.out.println("A soma dos numeros digitados é: " + soma);
		
		scan.close();
	}
}
