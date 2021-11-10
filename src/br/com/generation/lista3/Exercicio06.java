package br.com.generation.lista3;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		
		int numero,soma = 0,media = 0,contador = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite numeros para somar.");
		do {
			
			numero = scan.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				
				soma += numero;
				contador ++;
				
			}
		}
		
		while(numero != 0);
		
		media = soma/contador;
		System.out.println("A media dos multiplos de 3 digitados é: " + media);
		
		scan.close();
	}
}
