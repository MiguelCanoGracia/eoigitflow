package condicionales;
import java.util.Scanner;
public class ejer703 {
    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        int i, mayor, menor;
        float media;
        int [] nota = new int[5];

        for (i = 0; i < 5; i++) {
            System.out.println("dime la notas "+(i+1));
            nota[i] = SN.nextInt();
            while (nota[i]>10 || nota[i]<0) {
                System.out.println("Nota no valida");
                System.out.println("dime la notas "+(i+1));
                nota[i] = SN.nextInt();
            }
        }
        media = 0;
        for (i =0; i<5; i++) {
            media = media+nota[i];
        }
        media=media/5;
        mayor=nota[0];
        for (i=0;i<5;i++) {
            if (nota[i]>mayor) {
                mayor=nota [i];
            }
        }
        menor=nota[0];
        for (i=0;i<5;i++) {
            if (nota[i]<menor) {
                menor=nota [i];
            }
        }

        System.out.println();
        System.out.println("La nota media es: "+media);
        System.out.println("La nota mayor es: "+mayor);
        System.out.println("la nota menor es: "+menor);
    }
}