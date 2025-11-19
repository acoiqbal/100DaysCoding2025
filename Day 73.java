import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka;
        int total = 0;

        do {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            angka = sc.nextInt();

            if (angka >= 0) {
                total += angka;
            }

        } while (angka >= 0);

        System.out.println("Total penjumlahan: " + total);
    }
}
