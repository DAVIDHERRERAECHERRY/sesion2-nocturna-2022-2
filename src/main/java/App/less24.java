package app;

import javax.swing.JOptionPane;

public class less24 {

    public static void main(String[] args) {
        //NUMEROS PRIMOS Y NO PRIMOS 
        //ENTRADA
        int n = 25;
        int antecesores = 0;
        int rs = 0;
        int contadordivisible = 0;
        //PROCESO
        //JOptionPane.showMessageDialog(null, "Ingrese un numero");
        antecesores = n - 1;
        while (antecesores > 1) {
            if (n % antecesores == 0) {
                contadordivisible ++;

            }
            antecesores --;

        }
        //VALIDAR SI ES PRIMO
        if (contadordivisible == 0) {
            JOptionPane.showMessageDialog(null, "Si es primo");

        } else {
            JOptionPane.showMessageDialog(null, "No es primo");
        }
    }

}
