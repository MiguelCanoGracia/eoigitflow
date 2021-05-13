package condicionales;

import java.util.Scanner;

public class ejer420 {

	public static void main(String[] args) {
		
		Scanner scannerNum= new Scanner(System.in);
		int num1;
		System.out.println ("introduzca un numero");
		num1 = scannerNum.nextInt();
		if (num1 % 2==0) {
			System.out.println ("es par");
		}else {
			System.out.println ("es impar");
		}
	}
}


	}

}
