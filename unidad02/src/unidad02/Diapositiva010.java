package unidad02;

import java.util.Scanner;

public class Diapositiva010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Dime un número: ");	
		int num = sc.nextInt();
		while(num != 0) {
			if(num %2 == 0) {
				System.out.printf("El número %d es par\n",num);
			}
			else {
				System.out.printf("El número %d no es par\n",num);
			}
			System.out.println("Dime un número: ");
			num = sc.nextInt();
		}
	}
}
