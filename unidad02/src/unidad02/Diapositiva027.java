package unidad02;

public class Diapositiva027 {

	public static void main(String[] args) {
		int impar = 0;
		int suma = 0;
		
		for(int cont=1;cont<=20;cont++) {
			impar ++;
			if(impar % 2 == 1) {
				suma += impar;
			}
			
		}
		System.out.println("La suma de los 10 primeros numeros impares es: "+suma);
		

	}

}
