package pkg100.days.coding;

public class Day43 {

    public static void main(String[] args) {

        System.out.println("---------------------");
        System.out.println("Pola 26");
        System.out.println("---------------------");
        System.out.println("7");
        System.out.println("8");
        int pola26x = 7;
        int pola26y = 8;

        for (int i = 1; i <= pola26x; i++) {
            for (int j = 1; j <= pola26y; j++) {
                
                    if (i % 2 == 1) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("= ");
                    }
                
            }
            System.out.println();
        }

    }

}
