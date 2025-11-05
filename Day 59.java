import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int a = sc.nextInt();

        System.out.println("Ganjil 1 sampai N:");
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("\nGenap 1 sampai N:");
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
