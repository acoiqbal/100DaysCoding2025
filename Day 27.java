import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Soal 1");
        System.out.print("Panjang rumah : " );
        int a = sc.nextInt();
        System.out.print("Lebar rumah : ");
        int b = sc.nextInt();

        int luas = a * b;

        int total = luas / 4;

        System.out.println("Keramik yang di perlukan adalah : " + total);

        System.out.println("===================================");

        System.out.println("Soal 2");

        System.out.print("C : ");
        int c = sc.nextInt();
        System.out.print("D : ");
        int d = sc.nextInt();

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("C : " + c);
        System.out.println("D : " + d);

    }
}
