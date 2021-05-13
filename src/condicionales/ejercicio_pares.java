package condicionales;
import java.util.Scanner;
public class ejercicio_pares {

	public static void main(String[] args) {
		int num1,num2,i;
		Scanner scannerInt = new Scanner(System.in);
		
		System.out.println("dime los limites inferior");
		num1 = scannerInt.nextInt();
		
		System.out.println("dime los limites superior");
		num2 = scannerInt.nextInt();
		
		for (i=num1;i<num2+1;i=i+1){
			if (i%2==0){
				System.out.println(i);
		}
		}
		
	
	
	
	
	}

}
