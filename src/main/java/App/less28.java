package app;

import java.util.Scanner;

public class less28 {

    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

        int contarEdad1 = 0, contarEdad2 = 0;
        double ed = 0;
        double peso = 0;
        double estatura = 0;
        double promedioEdad = 0;
        double promedioEstatura = 0;
        double promedioPeso = 0;
        double promedioPesoEdad = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Invividuio: " + i);
            System.out.println("Ingresa la edad: ");
            ed = input.nextDouble();
            System.out.println("Ingresa el peso: ");
            peso = input.nextDouble();
            System.out.println("Ingresa la estatura: ");
            estatura = input.nextDouble();
            promedioEdad += ed;
            promedioPeso += peso;
            promedioEstatura += estatura;
            if (ed >= 18 && ed <= 25) {
                contarEdad1++;
                promedioPesoEdad += peso;
            } else if (ed > 36) {
                contarEdad2++;
            }
        }
        promedioEdad = promedioEdad / 10;
        promedioEstatura = promedioEstatura / 10;
        promedioPeso = promedioPeso / 10;
        promedioPesoEdad = promedioPesoEdad / contarEdad1;
        System.out.println("Promedio de las edades: " + promedioEdad);
        System.out.println("Promedio de las estaturas: " + promedioEstatura);
        System.out.println("Promedio de los pesos: " + promedioPeso);
        System.out.println("Personas entre 18 y 25 anios: " + contarEdad1);
        System.out.println("Personas mayores de 36: " + contarEdad2);
        System.out.println("Promedio del peso de personas entre 18 y 25 anios: " + promedioPesoEdad);
        
    }
}
