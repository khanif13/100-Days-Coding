package pkg100.days.coding;

public class Day38 {

    public static void main(String[] args) {

        System.out.println("--------------------");
        System.out.println("Pola 21");
        System.out.println("--------------------");
        System.out.println("5");
        int pola21 = 5;
        for (int i = 0; i < pola21; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < pola21; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }for (int j = pola21; j > i + 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
