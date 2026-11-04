package ejercicios02.boletin;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cadena de texto: ");
		String cadena = sc.next();
		
		String caracter = "";
		
		do {
			System.out.println("Dime un carácter: ");
			caracter = sc.next();
			
		}
		while(caracter.length() !=1);
		
		int contador = 0;
		
		
		for(int i=0; i<cadena.length(); i++) {
			String c = cadena.substring(i, i+1);
			
			if(c.equalsIgnoreCase(caracter)) {
				contador++;
				
			}
		}
		System.out.printf("El caracter %s aparece %d veces en la cadena %s \n", caracter, contador, cadena);
		

	}

}
