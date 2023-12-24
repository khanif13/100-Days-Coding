package pkg100.days.coding;

public class Day77 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        int max = a[0], min = a[0];
        
        System.out.print("deret angka : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println();
        System.out.println("maximal : " + max);
        System.out.println("minimal : " + min);
    }

}
