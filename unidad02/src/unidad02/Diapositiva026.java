package unidad02;

import java.util.Scanner;

public class Diapositiva026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int aux;
		
		do {
			System.out.println("Introduzca un número (1-10)");
			num = sc.nextInt();
		}while(!(num>=1 && num<=10));
		System.out.printf("Tabla del %d\n",num);
		for(int i = 1;i<=10;i++) {
			aux = num * i;
			System.out.printf(" %d X %d = %d\n", num, i, aux);
			
		}
		

	}

}
