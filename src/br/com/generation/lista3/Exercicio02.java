package br.com.generation.lista3;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		int numero,par = 0,impar = 0;
		
		System.out.println("Digite 10 numeros para saber quantos são par e quantos são impar.");
		for(int i = 0; i< 10; i++) {
			
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				par += 1;
			}
			else {
				impar+=1;
			}
		}
		
		System.out.printf("%d numeros são par e %d são impar.",par,impar);
		scan.close();
	}

}
