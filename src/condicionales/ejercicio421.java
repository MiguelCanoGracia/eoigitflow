package condicionales;

import java.util.Scanner;

public class ejercicio419 {
	public static void main(String[]args) {
		Scanner scannerNum= new Scanner(System.in);
		int num1,num2;
		//con esto pedimos el numero 1, con el escribir "dime tu numero", y lo de abajo es el leer;
		System.out.println ("introduzca un numero");
		num1 = scannerNum.nextInt();
		//con esto pedimos el numero 2
		System.out.println ("introduzca otro numero");
		num2 = scannerNum.nextInt();
		
		
		if (num2==0) {
			System.out.println ("el numero 2 es incorrecto");
		}else {
			System.out.println ("la division de sus numeros es "+ num1/num2);
		}
	}
}
