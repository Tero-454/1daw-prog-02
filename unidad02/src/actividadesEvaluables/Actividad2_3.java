package actividadesEvaluables;

public class Actividad2_3 {

	public static void main(String[] args) {
		System.out.println(digitosRec(123456789));

	}
	public static int digitosRec(int n) {
		if(n >= 0 && n < 10) {
			return 1;
		}
		return 1+digitosRec(n/10);
	}

}
