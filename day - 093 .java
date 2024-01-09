package pkg100.days.coding;

import java.util.Random;

public class Day93 {

    public static void mathRandom() {
        String mobil[] = {
            "Toyota",
            "Daihatsu",
            "Mazda",
            "KIA",
            "Ford"
        };
        int a = 0;
        int b = mobil.length - 1;
        for (int i = 0; i < 3; i++) {
            int random = a + (int) (Math.random() * ((b - a) + 1));
            System.out.println(mobil[random]);
        }
    }

    public static void main(String[] args) {
        Random acak = new Random();
        String buah[] = {
            "Pepaya",
            "Semangka",
            "Mangga",
            "Durian",
            "Rambutan"
        };
        int c = buah.length - 1;
        for (int i = 0; i < 3; i++) {
            int angka = acak.nextInt(c);
            System.out.println(buah[angka]);
        }
        System.out.println();
        mathRandom();
    }

}
