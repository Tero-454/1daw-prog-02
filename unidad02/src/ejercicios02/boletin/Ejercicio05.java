package ejercicios02.boletin;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int contImpares = 0;
		int contTotal = 0;
		int mayorPares = 0;
		int sumaImpares = 0;
		
		
		do {
			System.out.println("Dime un numero: ");
			num = sc.nextInt();
			if(num != 0) {
				contTotal++;
				if(num%2 != 0) {
					contImpares++;
					sumaImpares += num;
				}
				else if(num%2 == 0) {
					if(num > mayorPares) {
						mayorPares = num;
						
					}
				}	
			}
		}
		while(num != 0);
		System.out.printf("Se han introducido %d numeros en total, la media de los numeros impares es %.2f y el mayor numero par introducido es %d\n", contTotal, (sumaImpares*1.0)/contImpares, mayorPares);

	}

}
