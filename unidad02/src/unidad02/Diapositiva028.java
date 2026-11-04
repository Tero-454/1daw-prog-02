package unidad02;

import java.util.Scanner;

public class Diapositiva028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("Dime un numero: ");
			num = sc.nextInt();
		}while(!(num >= 0));
		do {
			System.out.println(num%10);
			num /= 10;
			
		}while(num>=1);
	}

}
