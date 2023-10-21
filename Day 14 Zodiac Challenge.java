package pkg100.days.coding;
import java.util.Scanner ;
public class Day14Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input your date of birth (1-31) = ");
        int tanggal = input.nextInt();
        System.out.print("Input your month of birth (1-12)= ");
        int bulan = input.nextInt();
        
        if ((tanggal >= 20 && tanggal <= 31 && bulan == 1 )||(tanggal >= 0 && tanggal <= 19 && bulan == 2)) {
            System.out.println("Your Zodiac is Aquarius ! ");
        }
        if ((tanggal >= 19 && tanggal <= 31 && bulan == 2 )||(tanggal >= 0 && tanggal <= 20 && bulan == 3)) {
            System.out.println("Your Zodiac is Pisces ! ");
        }
        if ((tanggal >= 21 && tanggal <= 31 && bulan == 3 )||(tanggal >= 0 && tanggal <= 19 && bulan == 4)) {
            System.out.println("Your Zodiac is Aries ! ");
        }
        if ((tanggal >= 20 && tanggal <= 31 && bulan == 4 )||(tanggal >= 0 && tanggal <= 20 && bulan == 5)) {
            System.out.println("Your Zodiac is Taurus ! ");
        }
        if ((tanggal >= 21 && tanggal <= 31 && bulan == 5 )||(tanggal >= 0 && tanggal <= 20 && bulan == 6)) {
            System.out.println("Your Zodiac is Gemini ! ");
        }
        if ((tanggal >= 21 && tanggal <= 31 && bulan == 6 )||(tanggal >= 0 && tanggal <= 22 && bulan == 7)) {
            System.out.println("Your Zodiac is Cancer ! ");
        }
        if ((tanggal >= 23 && tanggal <= 31 && bulan == 7 )||(tanggal >= 0 && tanggal <= 22 && bulan == 8)) {
            System.out.println("Your Zodiac is Leo ! ");
        }
        if ((tanggal >= 23 && tanggal <= 31 && bulan == 8 )||(tanggal >= 0 && tanggal <= 22 && bulan == 9)) {
            System.out.println("Your Zodiac is Virgo ! ");
        }
        if ((tanggal >= 23 && tanggal <= 31 && bulan == 9 )||(tanggal >= 0 && tanggal <= 22 && bulan == 10)) {
            System.out.println("Your Zodiac is Libra ! ");
        }
        if ((tanggal >= 23 && tanggal <= 31 && bulan == 10 )||(tanggal >= 0 && tanggal <= 21 && bulan == 11)) {
            System.out.println("Your Zodiac is Scorpio ! ");
        }
        if ((tanggal >= 22 && tanggal <= 31 && bulan == 11 )||(tanggal >= 0 && tanggal <= 21 && bulan == 12)) {
            System.out.println("Your Zodiac is Sagittarius ! ");
        }
        if ((tanggal >= 22 && tanggal <= 31 && bulan == 12 )||(tanggal >= 0 && tanggal <= 19 && bulan == 1)) {
            System.out.println("Your Zodiac is Capricorn ! ");
        }
    }
    
}
