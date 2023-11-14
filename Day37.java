package pkg100.days.coding;

public class Day37 {

    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("POLA 20");
        System.out.println("-------------------");
        System.out.println("5");
        int pola20 = 5;
        for (int i = 0; i < pola20; i++) {
            for (int j = 0; j < pola20 - i - 1; j++) {
                System.out.print("  ");
            }for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < pola20; i++) {
            for (int j = 0; j < pola20 - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
    
}
