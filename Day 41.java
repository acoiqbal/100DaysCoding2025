import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Soal 1 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int hasilJuri = a + b + c;

        if (hasilJuri >= 200 && a >= 50 && b >= 50 && c >= 50) {
            System.out.println("Lolos");
        }else {
            System.out.println("Tidak Lolos");
        }

        System.out.println("Saol 2 : ");

        int d = sc.nextInt();

        if (d % 2 == 0) {
            System.out.println("Tidak");
        }else {
            System.out.println("Perlu");
        }
    }
}
