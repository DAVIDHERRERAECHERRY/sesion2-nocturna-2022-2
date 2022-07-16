package app;

import java.util.Scanner;

public class less10 {

    public static void main(String[] args) {
        long n;
        long ax;
        long dg;
        long ent;
        int expo;
        boolean esBinario;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero binario: ");
            n = sc.nextLong();

            esBinario = true;
            ax = n;
            while (ax != 0) {
                dg = ax % 10;
                if (dg != 0 && dg != 1) {
                    esBinario = false;
                }
                ax = ax / 10;
            }
        } while (!esBinario);

        expo = 0;
        ent = 0;
        while (n != 0) {

            dg = n % 10;

            ent = ent + dg * (int) Math.pow(2, expo);

            expo++;

            n = n / 10;
        }
        System.out.println("Entero: " + ent);
    }
}
