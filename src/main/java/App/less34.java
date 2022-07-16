package app;

import java.util.Scanner;

public class less34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ld = 0;

        System.out.println("Digite la medida de un lado de un petagono: ");
        ld = input.nextInt();

        System.out.println("El perimetro del pentagono es: " + calcular(ld));

    }

    public static int calcular(int ld) {
        return ld * 5;

    }
}
