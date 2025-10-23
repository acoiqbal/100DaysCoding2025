import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pilih matakuliah : ");
        int a = sc.nextInt();

        System.out.println("=== MENU Pilihan Matakuliah ===");
        System.out.println("1. Cloud Computing");
        System.out.println("2. Pemrograman Jaringan");
        System.out.println("3. Robotik");
        System.out.println("=============================");
        System.out.println("Pilihan Anda: " + a);

        switch (a) {
            case 1:
                System.out.println("anda memilih matakuliah Cloud Computing");
            break;
            case 2:
                System.out.println("anda memilih matakuliah Pemrograman Jaringan");
            break;
            case 3:
                System.out.println("anda memilih matakuliah Robotik");
            break;
            default:
                System.out.println("angka yang anda masukkan tidak ada");
            break;
        }
    }
}
