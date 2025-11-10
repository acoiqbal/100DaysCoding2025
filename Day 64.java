import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka N : ");
        int a = sc.nextInt();
        
        System.out.print("masukkan angka M : ");
        int b = sc.nextInt();

        int total = 1;

        for (int i = 1; i <= a; i++) {
            total = total * b;
        }

        System.out.println("hasil dari M pangkat N : " + total);
    }
}
