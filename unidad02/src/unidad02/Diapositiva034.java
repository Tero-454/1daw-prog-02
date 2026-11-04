package unidad02;

public class Diapositiva034 {

	public static void main(String[] args) {

		for(int i = 1;i <=1000000;i++){
			System.out.println("La tabla del: "+i);
			for(int e = 1;e <= 100000; e++) {
				System.out.printf("%d X %d = %d\n", i, e, i*e);
			}
		}

	}

}
