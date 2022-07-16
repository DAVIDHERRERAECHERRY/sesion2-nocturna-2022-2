package app;

import java.util.Scanner;

public class less15 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int sg;
        int mints;
        int hr;

        System.out.print("Ingrese una cantidad en segundos: ");
        sg = Integer.parseInt(ingreso.next());
        hr = sg / 3600;
        mints = sg / 60;
        System.out.println("EN HORAS : " + hr);
        System.out.println("EN MINUTOS : " + mints);
    }
}
