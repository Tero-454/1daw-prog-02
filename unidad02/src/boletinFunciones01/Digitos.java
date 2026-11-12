package boletinFunciones01;

import java.util.Scanner;

public class Digitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		int totalNumeros = 0;
		
		do {
			System.out.println("Dime un numero entero y positivo: ");
			numero = sc.nextInt();
		}
		while(numero < 0);
		
		do {
			numero /= 10;
			totalNumeros++;
		}
		while(numero > 0);
		System.out.printf("El numero total de numeros que haz introducido es: %d", totalNumeros);
	}

}
