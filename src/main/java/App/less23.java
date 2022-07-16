package app;

import javax.swing.*;

public class less23 {

    public static void main(String[] args) {
        int n;
        int inv;
        int auxiliar;
        int digito;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        inv = 0;
        auxiliar = n;
        while (auxiliar > 0) {
            digito = auxiliar % 10;
            inv = inv * 10 + digito;
            auxiliar = auxiliar / 10;
        }
        if (n == inv) {
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es capicua");
        }
    }
}
