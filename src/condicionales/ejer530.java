package condicionales;

import java.util.Scanner;

public class ejer530 {

	public static void main(String[] args) {
		int horas, i;
		float sueldo, sueldoTotal;
		sueldoTotal = 0;

		// inicio para;
		for (i = 1; i < 7; i = i + 1) {
			Scanner scannerInt = new Scanner(System.in);

			// pedimos horas por dia;
			System.out.println("dime horas del dia " + i);
			horas = scannerInt.nextInt();
			// pedimos sueldo por dia;
			System.out.println("dime sueldo del dia " + i);
			sueldo = scannerInt.nextFloat();

			sueldoTotal = (horas * sueldo) + sueldoTotal;
			System.out.println("el sueldo total del trabajador ha sido " + sueldoTotal + " euros");
		}
	}
}
