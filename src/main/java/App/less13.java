package app;

import java.util.Scanner;

public class less13 {

    public static void main(String[] args) {
        int N;
        int auxl;
        int inv = 0;
        int cf;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingres un número menor o igual a  10: ");
            N = sc.nextInt();
        } while (N < 10);

        auxl = N;
        while (auxl != 0) {
            cf = auxl % 10;
            inv = inv * 10 + cf;
            auxl = auxl / 10;
        }

        if (N == inv) {
            System.out.println("Es capicuo");
        } else {
            System.out.println("No es capicuo");
        }
    }
}
