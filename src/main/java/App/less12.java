package app;

import java.util.Scanner;

public class less12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D;
        int M;
        int anio;
         System.out.println("Digita un dia:");
          D = sc.nextInt();
          System.out.println("Digita un mes: ");
           M = sc.nextInt();
        System.out.println("Digita un año: ");
        anio = sc.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año " + anio + " Si es bisiesto ");
        } else {
            System.out.println("El año " + anio + " No es bisiesto ");
        }
    }
}
