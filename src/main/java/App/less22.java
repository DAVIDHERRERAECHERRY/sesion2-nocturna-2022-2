package app;

import java.util.*;
import java.io.*;

public class less22 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        int cfrs;
        char car;
        do {
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cfrs = 0;    //esta variable es el contador de cifras
            while (n != 0) {             //mientras a n le queden cifras
                n = n / 10;         //le quitamos el último dígito
                cfrs++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cfrs + " cifras");
            System.out.print("Continuar? ");
            car = (char) System.in.read();
        } while (car != 'n' && car != 'N');
    }
}
