import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gaji kotor : ");
        double gajiKotor = sc.nextDouble();
        double tarifPajak = 0.10;

        double besarPajak = gajiKotor * tarifPajak;
        double gajiBersih = gajiKotor - besarPajak;

        System.out.println("=== Menghitung Gaji ===");
        System.out.println("Gaji Kotor : Rp " + gajiKotor);
        System.out.println("Potongan Pajak (10%): Rp " + besarPajak);
        System.out.println("------------------------------------");
        System.out.println("Gaji Bersih : Rp " + gajiBersih);

    }
}
