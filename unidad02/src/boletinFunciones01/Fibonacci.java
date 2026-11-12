package boletinFunciones01;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que numero de la suceción de Fibonacci quieres saber: ");
		int numero = sc.nextInt();
		long num = fibonacci(numero);
		System.out.println(num);

	}
	public static long fibonacci(long n) {
		if(n == 0 ) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		
		return fibonacci(n-2) + fibonacci(n-1);
	}

}
