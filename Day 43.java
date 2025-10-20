import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int a = sc.nextInt();

        if (a % 3 == 0) {
            if (a % 5 == 0) {
                System.out.println("ini adalah kelipatan 3 dan 5");
            }else {
                System.out.println("ini adalah kelipatan 3");
            }
        } else if (a % 5 == 0) {
            System.out.println("ini adalah kelipatan 5");
        }else {
            System.out.println("angka ini tidak termasuk kelipatan 3 dan 5");
        }
    }
}
