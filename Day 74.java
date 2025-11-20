import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Cloud Computing");
            System.out.println("2. Pemrograman Mobile");
            System.out.println("3. Robotik");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Anda memilih: Cloud Computing");
                    break;
                case 2:
                    System.out.println("Anda memilih: Pemrograman Mobile");
                    break;
                case 3:
                    System.out.println("Anda memilih: Robotik");
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (a != 4);
        
    }
}
