package boletinFunciones02;

import java.util.Random;
import java.util.Scanner;

import boletinFunciones01.Digitos;

public class Boletin4 {

	public static void main(String[] args) {
		adivinaNumero();
	}
//	public static void elGRanDerbi() {
//		Random r = new Random();
//		int inicio = 1000000000;
//		int fin = 99999999;
//		
//		int aleatorio
//		
//		
//		
//		while(aleatorio > 0) {
//			int digito = aleatorio %10;
//			
//			if(digito % 2)
//		}
//	}
	public static String conversorPalitosV1(int n) {
		String palitos = "";
		
		int volteado = Digitos.voltea(0);
		
		return palitos;
	}
	public static void adivinaNumero() {
		int num = 0;
		int inicio = 1;
		int fin = 100;
		int intentos = 10;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int aleatorio = r.nextInt(inicio, fin+1);
		do {
			System.out.printf("Tines %d intentos restantes.\n",intentos);
			intentos--;
			System.out.println("Dime un numero: ");
			num = sc.nextInt();
			if(num > aleatorio) {
				System.out.println("Tu numero es mayor.");
			}
			else if(num < aleatorio) {
				System.out.println("Tu numero es menor.");
			}
		}while((num != aleatorio)&&(intentos > 0));
		System.out.printf("Enorabuena el numero era %d y lo has adivinado en %d intentos.\n",aleatorio, 10-intentos);
	}
	public static boolean numerosAfortunados(int numero){
		boolean afortunado = false;
		int buenaSuerte = 0;
		int malaSuerte = 0;
		while(numero > 0) {
			int digito = numero % 10;
			
			switch(digito) {
				case 3,7,8,9 -> buenaSuerte++;
				default -> malaSuerte++;
			}
			numero = numero/10;
		}
		
		return buenaSuerte> malaSuerte;
	}

}
