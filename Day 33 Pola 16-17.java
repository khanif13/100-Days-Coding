package pkg100.days.coding;

public class Day33 {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("Pola 15");
        System.out.println("----------------------");
        int pola15 = 7;
        System.out.println("7");
        for (int i = 0; i < pola15; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        System.out.println("----------------------");
        System.out.println("Pola 16");
        System.out.println("----------------------");
        int pola16 = 7;
        System.out.println("7");
        for (int i = 0; i < pola16; i++) {
            for (int j = 0; j < pola16 - i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        System.out.println("----------------------");
        System.out.println("Pola 17");
        System.out.println("----------------------");
        int pola17 = 4;
        System.out.println("4");
        for (int i = 0; i < pola17; i++) {
            for (int j = 0; j < pola17 * 2; j++) {
                if (j == i || j == pola17 * 2 - 2 - i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

}
