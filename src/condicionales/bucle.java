package condicionales;
import java.util.Scanner;
public class bucle {

	public static void main(String[] args) {
		Scanner ScannerChar = new Scanner(System.in);
		char letra;
		do {
		System.out.println("dime tu letra");
			letra = ScannerChar.nextLine().charAt(0);
					if (letra == 'a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
						System.out.println("es vocal");
					}else {
						System.out.println("es consonante");
					}
		}while (letra != ' ');
	}

}