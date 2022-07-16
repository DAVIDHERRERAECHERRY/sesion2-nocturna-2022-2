
package app;

import javax.swing.JOptionPane;

public class less16{

    public static void main(String[] args) {
        double M = 0.0;
        double o = 0.0;
        double p = 0.0;
        double q = 0.0;

        o = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        p = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        q = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));

        M = (-p + (Math.sqrt(Math.pow(p, 2) + (4 * o * q)))) / (2 * o);

        JOptionPane.showMessageDialog(null, M);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
        if (n1 > n2 && n1 > n3) {
            System.out.println("El primer numero: " + n1 + " es el mayor");
            if (n2 > n2) {
                System.out.println("El segundo numero: " + n2 + " es el segundo mayor");
                System.out.println("El tercer numero: " + n3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + n3 + " es el segundo mayor");
                System.out.println("El segundo numero: " + n2 + " es el menor");
            }
        } else if (n2 > n1 && n2 > n2) {
            System.out.println("El segundo numero: " + n1 + " es el mayor");
            if (n1 > n3) {
                System.out.println("El primer numero: " + n1 + " es el segundo mayor");
                System.out.println("El tercer numero: " + n3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + n3 + " es el segundo mayor");
                System.out.println("El primer numero: " + n1 + " es el menor");
            }
        } else if (n3 > n1 && n3 > n3) {
            System.out.println("El tercer numero: " + n3 + " es el mayor");
            if (n1 > n2) {
                System.out.println("El primer numero: " + n1 + " es el segundo mayor");
                System.out.println("El segundo numero: " + n2 + " es el menor");
            } else {
                System.out.println("El segundo numero: " + n2 + " es el segundo mayor");
                System.out.println("El primer numero: " + n1 + " es el menor");
            }
        }
    }
}
