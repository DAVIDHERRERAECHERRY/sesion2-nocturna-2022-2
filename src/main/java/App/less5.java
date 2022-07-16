package app;

import javax.swing.JOptionPane;

public class less5 {

    public static void main(String[] args) {
        double z = 0.0;
        double s = 0.0;
        double t = 0.0;
        double u = 0.0;
        
        s = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        t = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        u = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));
        
        z = (-t +(Math.sqrt(Math.pow(t, 2) + (4*s*u))))/(2*s);
        
        JOptionPane.showMessageDialog(null, z);
    }
}
