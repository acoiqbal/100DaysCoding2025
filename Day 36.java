import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        if (nilai >= 70) {
            System.out.println("Lulus");

            if (nilai >= 90) {
                System.out.println("Predikat: A");
            } else if (nilai >= 75) {
                System.out.println("Predikat: B");
            } else {
                System.out.println("Predikat: C");
            }

        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
