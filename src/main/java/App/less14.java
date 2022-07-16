package app;

import javax.swing.JOptionPane;

public class less14 {

    public static void main(String[] args) {

        int seg = 0;
        int mints = 0;
        int hr = 0;
        int hs = 0;
        int ms = 0;

        hr = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas:"));
        mints = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos:"));
        hs = hr * 3600;
        ms = mints * 60;
        seg = hs + ms;
        JOptionPane.showMessageDialog(null, "El resultado en segundos es: " + seg);
    }
}

