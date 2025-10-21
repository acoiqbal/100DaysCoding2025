import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int a = sc.nextInt();

        if (a >= 90) {
            System.out.println("predikat : A");
        } else if (a >= 80) {
            System.out.println("Predikat : B");
        } else if (a >= 70) {
            System.out.println("Predikat : C");
        } else if (a >= 60) {
            System.out.println("Predikat : D");
        }else {
            System.out.println("Predikat : E");
        }
    }
}
