package br.com.generation.lista3;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		int numero,par = 0,impar = 0;
		
		System.out.println("Digite 10 numeros para saber quantos s�o par e quantos s�o impar.");
		for(int i = 0; i< 10; i++) {
			
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				par += 1;
			}
			else {
				impar+=1;
			}
		}
		
		System.out.printf("%d numeros s�o par e %d s�o impar.",par,impar);
		scan.close();
	}

}
