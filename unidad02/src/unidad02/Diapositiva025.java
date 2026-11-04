package unidad02;

import java.util.Scanner;

public class Diapositiva025 {

	public static void main(String[] args) {
		int total = 0;
		double media = 0;
		int aux = 0;
		Scanner sc = new Scanner(System.in);
		for(int num = 1;num<=10;num++) {
			System.out.printf("Dime el numero %d\n", num);
			aux = sc.nextInt();
			total = total + aux;
			
		}
		System.out.printf("La media es %.2f\n",(total*1.0)/10);
		
		sc.close();
	}

}
