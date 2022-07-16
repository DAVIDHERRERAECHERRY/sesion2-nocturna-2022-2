package app;

public class less30 {
    public static void main(String[] args) {
         String A0 = "", A1 = "", A2 = "", A3 = "", A4 = "", A5 = "", A6 = "";
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    A0 = "|" + i + "|" + j + "| ";
                } else if (i == 1) {
                    A1 += "|" + i + "|" + j + "| ";
                } else if (i == 2) {
                    A2 += "|" + i + "|" + j + "| ";
                } else if (i == 3) {
                    A3 += "|" + i + "|" + j + "| ";
                } else if (i == 4) {
                    A4 += "|" + i + "|" + j + "| ";
                } else if (i == 5) {
                    A5 += "|" + i + "|" + j + "| ";
                } else if (i == 6) {
                    A6 += "|" + i + "|" + j + "| ";
                }
            }

        }
        System.out.println(A0);
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println(A5);
        System.out.println(A6);
    }
}
