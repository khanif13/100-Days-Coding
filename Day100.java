package pkg100.days.coding;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dir = "D:/File Contoh/";
        String ext = ".txt";
        String nmFile;

        System.out.print("Input Nama file : ");
        nmFile = input.nextLine();

        try {
            File obj = new File(dir + nmFile + ext);
            if (obj.createNewFile()) {
                System.out.println("file telah dibuat");
            } else {
                System.out.println("file gagal dibuat");
            }
        } catch (IOException e) {
            System.out.println("Eror");
            e.printStackTrace();
        }

    }

}
