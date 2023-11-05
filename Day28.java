package pkg100.days.coding;

public class Day28 {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("Pola 11");
        System.out.println("----------------------");
        int pola11 = 5;
        System.out.println("5");
        for (int i = 0; i < pola11; i++) {
            for (int j = 0; j < pola11 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < pola11; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        System.out.println("Pola 12");
        System.out.println("----------------------");
        int pola12 = 5;
        System.out.println("5");
        for (int i = 0; i < pola12; i++) {
            for (int j = 0; j < pola12 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = pola12; i >= 0; i--) {
            for (int j = 0; j < pola12 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("----------------------");
        System.out.println("Pola 13");
        System.out.println("----------------------");
        int pola13 = 5;
        System.out.println("5");
        for (int i = pola13; i >= 1; i--) {
            for (int j = 0; j <= pola13 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < pola13; i++) {
            for (int j = 0; j < pola13 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        System.out.println("Pola 14");
        System.out.println("----------------------");
        int pola14 = 5;
        System.out.println("5");
        for (int i = 0; i < pola14; i++) {
            for (int j = 0; j < pola14 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = pola14; i >= 0; i--) {
            for (int j = 0; j < pola14 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

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

    }

}
