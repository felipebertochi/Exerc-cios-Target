package controller;

public class Questao_5 {
	static String inverterString(String texto) {
		String textoInvertido="";
		
		if (texto == null)
			return texto;
		
		for (int i = texto.length()-1;i>=0;i--) {
			textoInvertido = textoInvertido + texto.charAt(i);
		}
		
		return textoInvertido;
	}
	
	public static void main(String[] args) {
		
		System.out.println(inverterString("L F B"));
	}

}
