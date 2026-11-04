package ejercicios02.boletin;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		do {
			System.out.println("Dime una acdena detxto (min. 3 caracteres): ");
			cadena = sc.next();
			
		}
		while(cadena.length() < 3);
		
		String cadenaInvertida = "";
		int aux = cadena.length();
		
		for(int i = aux;i > 0; i--) {
			String c = cadena.substring(i-1, i);
			cadenaInvertida = cadenaInvertida + c;
		}
		if(cadena.equalsIgnoreCase(cadenaInvertida)) {
			System.out.printf("La palabra %s es palíndromo\n",cadena);
		}
		else {
			System.out.printf("La palabra  %s no es palíndromo\n",cadena);
			
		}
	}

}
