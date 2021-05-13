package condicionales;

import java.util.Scanner;

public class ejer421 {

	public static void main(String[] args) {
		String user;
		String password;
		
		
		Scanner scannerString = new Scanner(System.in);
		System.out.println ("introduzca un user");
		user = scannerString.nextLine();
		
		System.out.println("introduzca su password");
		password = scannerString.nextLine();
		
		if (user.equals ("pepe") && password.equals ("asdasd")) {
			System.out.println ("bienvenido");
		}else {
			System.out.println ("usuario o contrasenya incorrecto");
		
		}
	}
	

}
