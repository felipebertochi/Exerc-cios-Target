package controller;
import java.util.Scanner;

public class Questao_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if(fibonacci(numero)) {
			System.out.println(numero + " pertence à sequência de Fibonacci.");
		}else {
			System.out.println(numero + " não pertence à sequência de Fibonacci.");
		}
		
		scanner.close();
	}
	
	public static boolean fibonacci(int numero) {
		int primeiro = 0;
		int segundo = 1;
		
		while (segundo <= numero) {
			if (segundo == numero) {
				return true;
			}
			
			int proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
		}
		
		return false;
	}

}


