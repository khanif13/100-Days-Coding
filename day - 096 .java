package pkg100.days.coding;

public class Day96 {

    public static void main(String[] args) {

        String nm = "Ahmad Khanif Izzah Arifin";
        System.out.println("jmlh karakter\t: " + nm.length());
        System.out.println("uppercase\t: " + nm.toUpperCase());
        System.out.println("lowercase\t: " + nm.toLowerCase());

        System.out.println("char[0]\t\t: " + nm.charAt(0));
        String[] kalimat = nm.split(" ");
        System.out.println("nama depan\t: " + kalimat[0]);
        System.out.println("nama belakang\t: " + kalimat[3]);
        System.out.println("jmlh kalimat\t: " + kalimat.length);
    }

}
