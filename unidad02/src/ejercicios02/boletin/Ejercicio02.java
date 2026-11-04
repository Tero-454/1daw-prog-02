package ejercicios02.boletin;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String primeraLetra = "";
		String segundaLetra = "";
		
		System.out.println("Dime una palabra: ");
		String cadena = sc.next();
		int aux = cadena.length();
	
		
		do {
			System.out.println("Dime la letra que quieres cambiar: ");
			primeraLetra = sc.next();
			
		}
		while(primeraLetra.length() !=1);
		
		do {
			System.out.println("Dime la letra por la quieres cambiar: ");
			segundaLetra = sc.next();
			
		}
		while(segundaLetra.length() !=1);
		
		for(int i = 0; i < aux;i++) {
			String c = cadena.substring(i, i+1);
			if(c.equalsIgnoreCase(primeraLetra)) {
				System.out.printf("%s", segundaLetra);
			}
			else {
				
				System.out.printf("%s", c);
			}
		}
		sc.close();
	}
}
