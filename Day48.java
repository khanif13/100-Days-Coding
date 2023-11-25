package pkg100.days.coding;

import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String member;
        int merkHp, typeHp;
        double harga, diskon = 0.05, hargaDiskon, totalHarga;

        System.out.println("1. Iphone \n2. Huawei");
        System.out.print("\nMerk Hp : ");
        merkHp = sc.nextInt();

        if (merkHp == 1) {
            System.out.println("================================");
            System.out.print("1. Iphone 13 Pro Max\nRp. 25.000.000 \n2. Iphone 12 Pro Max\nRp. 18.000.000");
            System.out.print("\nType Hp : ");
            typeHp = sc.nextInt();
            System.out.println("================================");
            if (typeHp == 1) {
                harga = 25000000;
                System.out.print("\nKartu Member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("================================");
                    System.out.println("\nMendapatkan diskon sebesar 5%");
                    hargaDiskon = harga * diskon;
                    totalHarga = harga - hargaDiskon;
                    System.out.println("Total Harga Rp. " + totalHarga);
                } else {
                    System.out.println("Total harga Rp. " + harga);
                }
            } else if (typeHp == 2) {
                harga = 18000000;
                System.out.print("Kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("================================");
                    System.out.println("\nMendapatkan diskon sebesar 5%");
                    hargaDiskon = harga * diskon;
                    totalHarga = harga - hargaDiskon;
                    System.out.println("Total harga Rp. " + totalHarga);
                } else {
                    System.out.println("Total harga Rp. " + harga);
                }
            }
        }
        if (merkHp == 2) {
            System.out.println("================================");
            System.out.print("1. Huawei P50 Pro\nRp. 13.000.000 \n2. Huawei Mate 60 Pro\nRp. 34.000.000");
            System.out.print("\nType Hp : ");
            typeHp = sc.nextInt();
            System.out.println("================================");
            if (typeHp == 1) {
                harga = 13000000;
                System.out.print("\nKartu Member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("================================");
                    System.out.println("\nMendapatkan diskon sebesar 5%");
                    hargaDiskon = harga * diskon;
                    totalHarga = harga - hargaDiskon;
                    System.out.println("Total Harga Rp. " + totalHarga);
                } else {
                    System.out.println("Total harga Rp. " + harga);
                }
            } else if (typeHp == 2) {
                harga = 34000000;
                System.out.print("Kartu member (y/n) ? : ");
                member = sc.next();
                if (member.equalsIgnoreCase("y")) {
                    System.out.println("================================");
                    System.out.println("\nMendapatkan diskon sebesar 5%");
                    hargaDiskon = harga * diskon;
                    totalHarga = harga - hargaDiskon;
                    System.out.println("Total harga Rp. " + totalHarga);
                } else {
                    System.out.println("Total harga Rp. " + harga);
                }
            }
        }

    }

}
