package unidad02;


import java.util.Scanner;

public class Diapositiva023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Dime un numero: ");
			numero = sc.nextInt();
		}while(numero <2);
		
		
		for(int cont = 1;cont<= numero;cont++) {
			System.out.println(cont);
			
		}
		

	}

}
