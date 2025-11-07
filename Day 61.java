import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka N : ");
        int a = sc.nextInt();
        System.out.print("masukkan kelipatan M : ");
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % b == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
