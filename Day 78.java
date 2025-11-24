import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = sc.nextLine();

        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang kalimat         : " + kalimat.length());
        System.out.println("Huruf besar             : " + kalimat.toUpperCase());
        System.out.println("Huruf kecil             : " + kalimat.toLowerCase());
        System.out.println("Apakah mengandung kata 'Saya'? : " + kalimat.contains("Saya"));
        System.out.println("Menghapus spasi depan & belakang:" + "[" + kalimat.trim() + "]");
        
        if (kalimat.length() >= 5) {
            System.out.println("Substring (0,5)         : " + kalimat.substring(0, 5));
        } else {
            System.out.println("Substring tidak bisa diambil (terlalu pendek)");
        }
    }
}
