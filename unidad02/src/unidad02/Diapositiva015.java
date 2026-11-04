package unidad02;

import java.util.Scanner;

public class Diapositiva015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vocal = "";
		do{
			System.out.println("Dime una vocal: ");
			vocal = sc.next();
			vocal.toLowerCase();
		}while(vocal != "a" && vocal != "e" && vocal != "i" && vocal != "o" && vocal != "u");
		System.out.println("Correcto");
			
		
	}
}
