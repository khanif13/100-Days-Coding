package pkg100.days.coding;

public class Day36 {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Pola 19");
        System.out.println("----------------------");
        System.out.println("4");
        int pola19 = 7;
        for (int i = 0; i < pola19; i++) {
            for (int j = 0; j < pola19 * 2; j++) {
                if (j == i || j == pola19 - i - 1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        

    }
    
}
