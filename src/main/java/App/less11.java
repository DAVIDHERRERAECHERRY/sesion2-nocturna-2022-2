package app;

import java.util.Scanner;

public class less11 {

    public static void main(String[] args) {
int numero=0;
	 Scanner escaner = new Scanner(System.in);
	System.out.println("Digita un numero: ");
	numero = escaner.nextInt();
	
	int millar=numero/1000;
	int centenas=(numero-(millar*1000))/100;
	int decenas=(numero- (millar*1000 + centenas*100))/10;
	int unidades=numero-(millar*1000 + centenas*100 + decenas*10 );

	System.out.println("Millares = "+ millar);
	System.out.println("Centenas = "+ centenas);
	System.out.println("Decenas = "+ decenas);
	System.out.println("Unidades = "+ unidades);
}
    }
