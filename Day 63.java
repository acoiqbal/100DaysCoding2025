import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka N : ");
        int a = sc.nextInt();

        int total = 1;

        for (int i = 1; i <= a; i++) {
            total = total * i;
        }

        System.out.println("hasil dari perkalian 1 - N : " + total);
    }
}
