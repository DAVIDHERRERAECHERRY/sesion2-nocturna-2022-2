package app;

import java.util.Scanner;

public class less7 {

    public static void main(String[] args) {
        int N;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digita un número entero: ");
        N = teclado.nextInt();

        if (N % 2 == 0) {
            System.out.printf("El numero es par");
        } else {
            System.out.printf("El numero es impar");
        }
    }
}
