package unidad02;

import java.util.Scanner;

public class Diapositiva031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("1. Opción 1.");
			System.out.println("2. Opción 2.");
			System.out.println("3. Opción 3.");
			System.out.println("4. Opción 4.");
			System.out.println("5. Salir.");
			num = sc.nextInt();
			switch(num) {
				case 1 :System.out.println("Ejecutando la opción 1.");
				break;
				case 2 :System.out.println("Ejecutando la opción 2.");
				break;
				case 3 :System.out.println("Ejecutando la opción 3.");
				break;
				case 4 :System.out.println("Ejecutando la opción 4.");
			}

		}while(num>0 && num<5);
		System.out.println("Saliendo...........");
		

	}

}
