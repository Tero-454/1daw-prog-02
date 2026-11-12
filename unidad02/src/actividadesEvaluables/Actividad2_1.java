package actividadesEvaluables;

import java.util.Scanner;

public class Actividad2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long numero = 0;
		long aux = 0;
		int unidades = 0;
		int sumaPares = 0;
		int cantidadPares = 0;
		
		do {
			System.out.println("Dime un numero: ");
			numero = sc.nextLong();
		}while(numero<=0);
		
		aux = numero;
		
		do {
			unidades = (int)numero %10;
			numero = numero/10;
			
			if(unidades%2 == 0) {
				cantidadPares++;
				sumaPares += unidades;
			}
		}
		while(numero > 0);
		System.out.printf("El numero %d tiene %d numeros pares y la suma de esos numeros es %d\n", aux, cantidadPares, sumaPares );
		sc.close();
	}
	

}
