package actividadesEvaluables;
import java.util.Scanner;
public class Actividad2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena = "";
		String c = "";
		String cadenaNueva = "";
		int longitudCadena = 0;
		do {
		System.out.println("Dime una cadena de texto con mayusculas y minusculas: ");
		cadena = sc.next();
		}while(cadena.length() <= 1);
		longitudCadena = cadena.length();
		for(int i = 1; i<=longitudCadena;i++) {
			 c = cadena.substring(i-1, i);
			
			if(c.toUpperCase().equals(c)) {
				c = c.toLowerCase();
			}
			else {
				c = c.toUpperCase();
			}
			cadenaNueva += c;
		}
		System.out.printf("La nueva cadena es la siguiente: %s\n",cadenaNueva);
		sc.close();
	}

}
