package app;

import java.util.Scanner;

public class less31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0;
        double sm = 0;
        double prm = 0;
        int ctdr = 0;

        System.out.println("Digite un numero: ");
        numero = input.nextInt();

        sm += numero;

        while (numero != 0) {
            System.out.println("Digite un numero: ");
            numero = input.nextInt();
            sm += numero;
            ctdr++;
        }
        prm = sm / ctdr;
        System.out.println("Su promedio es: " + prm);
    }
}
