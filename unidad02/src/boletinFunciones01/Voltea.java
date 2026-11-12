package boletinFunciones01;

import java.util.Scanner;

public class Voltea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numero = 0;
		int totalNumeros = 0;
		byte unidad =0;
		
		do {		
			System.out.println("Dime un numero mayor a 10 y positivo");
			numero = sc.nextInt();
		}
		while(numero<10 || numero<0);
		do {
			numero /= 10;
			totalNumeros++;
		}
		while(numero > 0);
		for
		
		
	
	}
	

}
