package app;

import java.util.Scanner;

class less8 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
  
        System.out.println("Digita un número:");
      
        double numero = escaner.nextDouble();
     
        if (numero < 0) {
            System.out.println("Su número es negativo");
        } else {
            System.out.println("Su número es positivo");
        }

    }
}
