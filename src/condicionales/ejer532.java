package condicionales;

public class ejer532 {

	public static void main(String[] args) {
		int cont, dinero, suma;
		suma = 0;
		dinero = 5;

		for (cont = 1; cont < 21; cont = cont + 1) {
			dinero = dinero * 2;
			System.out.println("debe pagar al mes " + cont + ", " + dinero + " euros ");
			suma = suma + dinero;
		}
		System.out.println("todo asciende a " + suma + " euros");
	}

}
