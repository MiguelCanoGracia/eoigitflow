import java.util.Scanner;
public class ejercicio533 {

    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in);
        int salario_hora,n,horasT,pago_total,i,salarioT,horas;

        System.out.println("introduzca salario por hora");
        salario_hora = scannerNum.nextInt();

        System.out.println("introduzca  numero de trabajadores");
        n = scannerNum.nextInt();

        pago_total=0;
        for(i=0;i<n;i=i+1) {
            System.out.println("introduzcalas horas trabajas en la semana por el trabajador"+i);
            horas = scannerNum.nextInt();
            salarioT= horas*salario_hora;
            pago_total=pago_total+ salarioT;

            System.out.println("el salario recibido por el trabajador"+ i+1 +"fue de"+ salarioT );}

        System.out.println("el pago total realizado por la empresa fue de"+pago_total);
    }
}
