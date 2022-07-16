package app;

import java.util.Scanner;

public class less36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ciudaDeInicio = "";
        String ciudadDeLlegada = "";
        double M = 0;

        System.out.println("ingrese la ciudad de origen: ");
        ciudaDeInicio = input.nextLine();
        System.out.println("ingrese la ciudad de destino: ");
        ciudadDeLlegada = input.nextLine();
        System.out.println("ingrese la distancia en millas: ");
        M = input.nextDouble();
        MillasAKilometros(ciudaDeInicio, ciudadDeLlegada, M);
    }

    public static void MillasAKilometros(String ciudadO, String ciudadD, double millas) {
        double kilometros = millas * 1.609;
        System.out.println("Entre la Ciudad " + ciudadO + " y la Ciudad " + ciudadD + " hay " + kilometros + " Km");
    }
}
