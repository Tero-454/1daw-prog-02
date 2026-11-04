package unidad02;

import java.util.Scanner;

public class Diapositiva038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero para el triangulo: ");
		int num = sc.nextInt();
		for(int i = 1;i<=num;i++) {
			System.out.println("");
			for(int e = 1;e<=i;e++) {
				System.out.printf("%d ",e);
				
			}
		}
		
		

	}

}
