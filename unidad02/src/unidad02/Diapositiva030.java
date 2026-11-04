package unidad02;

import java.util.Scanner;

public class Diapositiva030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota = 0;
		int susp = 0;
		for(int i = 1;i<=5;i++) {
			do {
				System.out.printf("Dime la nota de el alumno numero %d: \n",i);
				nota = sc.nextInt();
			}while(!(nota>=0 && nota<=10));
			if(nota<5) {
				susp++;
			}
			
			
		}
		System.out.printf("Han suspendido %d alumnos\n", susp);

	}

}
