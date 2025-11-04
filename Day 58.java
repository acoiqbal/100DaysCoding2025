import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int a = sc.nextInt();

        System.out.println("Perulangan 1 sampai N:");
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("\nPerulangan N sampai 1:");
        for (int i = a; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
