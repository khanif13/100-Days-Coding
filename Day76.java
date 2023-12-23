package pkg100.days.coding;

import java.util.Arrays;
import java.util.Collections;

public class Day76 {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4, 5, 100, 6, 7, 8, 9};
        int max = Collections.max(Arrays.asList(a));
        int min = Collections.min(Arrays.asList(a));

        System.out.print("Deret Angka : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Nilai Maksimal : " + max);
        System.out.println("Nilai Minimal  : " + min);

    }

}
