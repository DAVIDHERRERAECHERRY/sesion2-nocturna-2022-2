package app;

import java.util.Scanner;

public class less32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ed = 0;
        double prm = 0;
        int ctdr = 0;
        double sm = 0;

        System.out.println("Digita una edad: ");
        ed = input.nextInt();
        sm += solicitar(ed);
        while (ed != 0) {
            System.out.println("Digita una edad: ");
            ed = input.nextInt();
            sm += solicitar(ed);
            if (ed > 18) {
                ctdr++;
            }
            System.out.println("Digite 0 para finalizar...");
        }
        prm = sm / ctdr;
        System.out.println("El promedio es: " + prm);
    }

    public static double solicitar(int edad) {
        if (edad > 18) {
            return edad;
        } else {
            return 0;
        }
    }
}
