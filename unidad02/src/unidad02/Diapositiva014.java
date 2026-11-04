package unidad02;

import java.util.Scanner;

public class Diapositiva014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Dime un número (1-10): ");
			num = sc.nextInt();
			
		}while(num < 1 || num > 10);
		System.out.println("El numero es correcto");

	}

}
