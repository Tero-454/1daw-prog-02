package boletinFunciones01;

import java.util.Scanner;

public class Digitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		
		
		do {
			System.out.println("Dime un numero entero y positivo: ");
			numero = sc.nextInt();
		}
		while(numero < 0);
		contadorNumeros(numero);
		
		System.out.printf("El numero total de numeros que haz introducido es: %d", contadorNumeros(numero));
	}
	public static int contadorNumeros(long i) {
		int num = 0;
		do {
			i /= 10;
			num++;
		}
		while(i > 0);
		return num;
	}
	public static int voltea(int n) {
		int volteado = 0;
	
		while(n != 0) {
			int digito = n % 10;
			
			volteado = volteado * 10 + digito;			
			
			n /= 10;
		}
		
		return volteado;
	}
	public static int siguientePrimo(int n) {
		int siguiente = n+1;
		while(!esPrimo(siguiente)) {
			siguiente++;
		}
		
	
		return siguiente;
	}
	public static boolean esCapicua(int n) {
		int volteado = voltea(n);
		boolean resultado = (volteado == n);
		return resultado;
	}
	public static int digitoN(int numero, int posicion) {
		int digito = -1;
		int volteado = voltea(numero);
		int contador = 0;
		if(posicion >= 0 && posicion <= contadorNumeros(numero))
		for(int i = 0;i>=digito;i++) {
			
		}
		return digito;
	}
}