import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5]; 

        System.out.println("=== INPUT DATA ARRAY ===");
        for(int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            angka[i] = sc.nextInt();
        }
    }
}
