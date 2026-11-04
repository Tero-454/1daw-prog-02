package unidad02;

import java.util.Scanner;

public class Diapositiva029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		int aux = 1;
		
		for(int cont = num;cont>1;cont--) {
			aux *= cont;
			
		}
		System.out.println(aux);

	}

}
