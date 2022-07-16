package app;

import java.util.*;

public class less25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Indica el numero a calcular su factorial: ");

        int vCalcular = 0;

        // bucle mientras valorCacular es inferior a 1
        while (vCalcular < 1) {
            try {
                // Solicitamos un entero
                vCalcular = entrada.nextInt();

                // Indicamos que es incorrecto si el valor es inferior a1
                if (vCalcular < 1) {
                    System.out.println("El valor tiene que ser superior a 0");
                }
            } catch (InputMismatchException e) {
                // Controlamos que siempre introduzca un valor numerico
                System.out.println("El valor tiene que ser numerico...");
                entrada.nextLine();
            }
        }

        long fac = 1L;
        for (int i = vCalcular; i > 0; i--) {
            fac = fac * i;
        }

        System.out.println("El factorial de " + vCalcular + " es " + fac);
    }

}
