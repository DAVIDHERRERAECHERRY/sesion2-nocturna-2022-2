package app;

import java.util.Scanner;

public class less33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int expo = 0;
        int bs = 0;

        System.out.println("ingrese la base: ");
        bs = input.nextInt();
        System.out.println("ingrese el exponente: ");
        expo = input.nextInt();

        System.out.println("El resultado es: " + elevar(bs, expo));

    }

    public static double elevar(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
