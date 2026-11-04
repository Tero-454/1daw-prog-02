package unidad02;

import java.util.Scanner;

public class Diapositiva009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroEnt = 0;
		int sumaNumeros = 0;
		
		while(numeroEnt <= 9) {
			

			System.out.printf("Dime el número %d: ",numeroEnt+1);
			int numero = sc.nextInt();
			
			sumaNumeros = sumaNumeros + numero;
			++numeroEnt;
			
			
		}
		System.out.printf("La suma total de los numeros es %d y la media es %.2f\n", sumaNumeros, (sumaNumeros *1.0)/10);

	}

}
