package controller;

public class Questao_1 {
	public static void main(String[] args) {
		int indice = 13, soma = 0, k = 0;
		
		while (k < indice) {
			k = k + 1;
			soma = soma + k;
		}
		
		System.out.println(soma);
	}

}

/*
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;
SOMA = SOMA + K;

}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

R: 91
*/