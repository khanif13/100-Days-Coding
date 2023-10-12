package day.pkg4.operator.aritmatika;
import java.util.Scanner ;
public class Day4OperatorAritmatika {
    public static void main(String[] args) {
/* Operator Aritmatika menggunakan scanner sederhana
        Operator Aritmatika adalah operator yang digunakan untuk melakukan proses Aritmatika :
            1. Penjumlahan
            2. Pengurangan
            3. Perkalian
            4. Pembagian
            5. Sisa bagi atau Modulus
        */ 
        Scanner input = new Scanner (System.in);
        int a, b, c ;/// Variabel kosong
        System.out.print("Nilai A = ");/// Ini adalah menginput nilai variabel a
        a = input.nextInt();
        System.out.print("Nilai B = ");/// Ini menginput nilai variabel b
        b = input.nextInt();
        c = a + b ; /// Ini adalah variabel operasi penjumlahan
        System.out.print("Hasil dari "+ a + " + " + b + " = ");
        System.out.println(c);
        c = b - a ; /// Ini adalah variabel operasi pengurangan
        System.out.println("Hasil dari "+ b + " - " + a + " = " + c);
        c = a * b ; /// Ini adalah variabel operasi perkalian
        System.out.println("Hasil dari "+ a + " x " + b + " = " + c);
        c = b / a ; /// Ini adalah variabel operasi pembagian 
        System.out.println("Hasil dari "+ b + " : " + a + " = " + c);
        c = b % a ; /// Ini adalah variabel operasi sisa bagi
        System.out.println("Hasil dari " + b + " % " + a + " = " + c);
        
    }
    
}
