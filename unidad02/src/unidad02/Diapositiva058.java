package unidad02;

public class Diapositiva058 {

	public static void main(String[] args) {
	

	}
	
	public static boolean validadorPassword(String password) {
		boolean valida = false;
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		int especiales = 0;
		
		for(int i=0;i<password.length(); i++) {
			String c = password.substring(i, i+1);
			
			if(c.matches("[a-z]")) {
				minus++;
			}
				
			else if(c.matches("[A-Z]")) {
				mayus++;
			}
			
		}
			
		return valida;
	}
		
	

}
