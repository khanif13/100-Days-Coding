package pkg100.days.coding;

public class Day34 {

    public static void main(String[] args) {

        System.out.println("------------------------");
        System.out.println("Pola 18");
        System.out.println("------------------------");
        System.out.println("4");
        int pola18 = 4;
        for (int i = 1; i <= pola18; i++) {
            for (int j = pola18; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        

    }
    
}
