package app;

import java.util.Scanner;

public class 
        less35{

    public static void main(String[] args) {
        int hr;
        int Hextras;
        int Lhoras;
        double pago;
        double Lpago;
        double P_extra;
        double sueldo;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite las horas trabajadas: ");
        hr = entrada.nextInt();

        System.out.print("Digite el pago por cada hora: ");
        pago = entrada.nextInt();

        if (hr <= 40) {
            Hextras = hr - 40;
            P_extra = pago * 1.5;
            sueldo = (40 * pago) + (Hextras * P_extra);

        } else {
            sueldo = hr * pago;
        }

        System.out.print("El sueldo por horas es:  " + hr + "\n Tu sueldo es: \n" + sueldo);

    }
}
