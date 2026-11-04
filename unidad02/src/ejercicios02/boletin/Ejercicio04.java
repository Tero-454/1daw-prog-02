package ejercicios02.boletin;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorCeros = 0;
		System.out.println("Dime la cantidad de numeros que quieres que pedir: ");
		int num = sc.nextInt();
		for(int i = 1; i<=num;i++) {
			System.out.printf("Dime el numero %d: \n", i);
			int numero = sc.nextInt();
			if(numero>0) {
				contadorPositivos++;
			}
			else if(numero == 0) {
				contadorCeros++;	
			}
			else if(numero < 0) {
				contadorNegativos++;	
			}
		}
		System.out.printf("Haz introducido %d numeros positivos, %d numeros negativos y %d ceros\n",contadorPositivos, contadorNegativos, contadorCeros);
	

	}

}
