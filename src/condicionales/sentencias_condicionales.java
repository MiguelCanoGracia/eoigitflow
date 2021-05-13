package condicionales;

public class sentencias_condicionales {
	public static void main(String[]args) {
	//definir num1, num2 como entero
		int num1, num2;	
	//num1<-8
		num1=4;
	//num2<-6
		num2=4;
	//si num1>num2 entonces
			if (num1 > num2) {
				System.out.println("num1 es mayor que num2");
			}else {
				if (num1<num2) {
					System.out.println ("num1 es menor que num2");
				}else { 
					System.out.println ("num 1 es igual a num 2");
					}
				}
		
	}
}