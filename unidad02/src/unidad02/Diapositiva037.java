package unidad02;

import java.util.Scanner;

public class Diapositiva037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero para el triangulo: ");
		int num = sc.nextInt();
		for(int i = num;i>0;i--) {
			System.out.println("");
			for(int e=i;e>0;e--) {
				System.out.printf("*");
				
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime un numero para el triangulo: ");
//		int num = sc.nextInt();
		for(int i = num;i>0;i--) {
			System.out.println("");
			for(int e=num;e>=i;e--) {
				System.out.printf("*");
				
			}
		}

		sc.close();
	}

}
