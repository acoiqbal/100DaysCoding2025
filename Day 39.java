import java.util.Scanner;

public class Day39 {
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
        System.out.println("-----------------------------");

        if (a == 1) {
            System.out.println("Anda memilih Matakuliah Cloud Computing");
        } else if (a == 2) {
            System.out.println("Anda memilih Matakuliah Pemrograman Jaringan");
        } else if (a == 3) {
            System.out.println("Anda memilih Matakuliah Robotik");
        }else {
            System.out.println("Maaf, Pilihan Tidak Ada Di Menu");
        }
    }
}
