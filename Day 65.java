import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka N : ");
        int a = sc.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= a; i++) {
            faktorial = faktorial * i;
        }

        System.out.println("Hasil faktorial dari " + a + "! adalah: " + faktorial);
    }
}
