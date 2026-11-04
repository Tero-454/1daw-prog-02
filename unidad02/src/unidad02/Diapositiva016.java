package unidad02;

import java.util.Scanner;

public class Diapositiva016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		
		int numero2 = 0;
		do {
			System.out.println("Dime el primer número");
			numero1 = sc.nextInt();
			System.out.println("Dime el primer número");
			numero2 = sc.nextInt();
		}
		while(numero1 != numero2);
		

	}

}
