package unidad02;

import java.util.Random;
import java.util.Scanner;

public class Diapositiva018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int inicio = 1;
		int fin = 99;
		
		int aleatorio1 = 0;
		int aleatorio2 = 0;
		int resultado = 0;
		int aciertos = 0;
		
		do {
			aleatorio1 = r.nextInt(inicio, fin +1);
			aleatorio2 = r.nextInt(inicio, fin +1);
			
			System.out.printf("%d + %d = ?\n", aleatorio1, aleatorio2);
			resultado = sc.nextInt();
			if(aleatorio1+ aleatorio2 == resultado) {
				aciertos++;
			}
			else {
				System.out.printf("Has fallado. El resultado era %d y has acertado %d veces \n",aleatorio1+ aleatorio2, aciertos);
			}
				
		} while (aleatorio1+ aleatorio2 == resultado);
	}

}
