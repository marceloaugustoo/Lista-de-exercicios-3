package br.com.generation.lista3;

public class Exercicio01 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 1000; i<= 1999; i++) {
			
			if(i % 11 == 5) {
				System.out.println(i);
			}
		}

	}

}
