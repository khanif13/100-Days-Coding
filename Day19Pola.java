package pkg100.days.coding;
public class Day19Pola {
    public static void main(String[] args) {
         System.out.println("--------------------");
        System.out.println("Pola 1");
        System.out.println("--------------------");
        int pola1 = 6;
        System.out.println("6");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < pola1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("---------------------");
        System.out.println("Pola 2");
        System.out.println("---------------------");
        int pola2 = 8;
        System.out.println("8");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < pola2; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }

        System.out.println("---------------------");
        System.out.println("Pola 3");
        System.out.println("---------------------");
        int pola3x = 3;
        int pola3y = 5;
        System.out.println("3");
        System.out.println("5");
        for (int i = 0; i < pola3x; i++) {
            for (int j = 0; j < pola3y; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("----------------------");
        System.out.println("Pola 4");
        System.out.println("----------------------");
        int pola4 = 5;
        for (int i = 0; i < pola4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("----------------------");
        System.out.println("Pola 5");
        System.out.println("----------------------");
        int pola5 = 7;
        for (int i = pola5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
    
}
