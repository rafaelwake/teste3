package br.fai.teste3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();


	}
	
	Scanner scanner = new Scanner(System.in);


	private void start() {
		result();
	}
	
	private void result() {
		System.out.println("Hello");
	
		for (int i = 0; i < 5; i++) {
			
				switch (i) {
				case 1:
						System.out.println("primeiro");

					break;
				case 2:
					System.out.println("segundo");

				break;

				default:
					break;
			
		}
		
	}

	}
}
