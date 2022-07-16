package app;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;


public class less19 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014,1,1);
        int ms = date.getMonthValue();
        int da = date.getDayOfMonth();
        int mesIn;
        int diaIn;
        
        mesIn = Integer.parseInt(JOptionPane.showInputDialog("Digita un el mes:"));
        diaIn = Integer.parseInt(JOptionPane.showInputDialog("Digita el dia:"));
        
        LocalDate dateIn = LocalDate.of(2014, mesIn, diaIn);
        
        Period periodo = Period.between(date, dateIn);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        
        System.out.println(date+"\n"+dateIn);
        System.out.println("Han pasado: "+meses+" meses y "+dias+" dias");
    }
    
}
