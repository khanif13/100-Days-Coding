package pkg100.days.coding;

import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {

        String[][] dataMahasiswa = new String[5][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nInput Data Mahasiswa ke- " + (i + 1));
            dataMahasiswa[i] = inputMahasiswa(sc);
        }
        
        System.out.println("Data Mahasiswa Penerima KIPK : ");
        System.out.println("============================");
        System.out.println("No. | Nama\t| NIM\t\t| Nilai");
        System.out.println("============================");
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". | "+dataMahasiswa[i][0]+"\t| "+dataMahasiswa[i][1]+"\t| "+dataMahasiswa[i][2]);
        }
        
        sc.close();
    }
    
    private static String[] inputMahasiswa(Scanner sc){
        String[] mahasiswa = new String[3];
        System.out.print("Masukkan nama : ");
        mahasiswa[0] = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        mahasiswa[1] = sc.nextLine();
        System.out.print("Masukkan Nilai : ");
        mahasiswa[2] = sc.nextLine();
        return mahasiswa;
    }

}
