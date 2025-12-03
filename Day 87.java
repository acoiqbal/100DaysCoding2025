import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = {10, 25, 30, 45, 50, 75};
        
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();

        boolean ditemukan = false;
        
        for(int i = 0; i < angka.length; i++) {
            if(angka[i] == cari) {
                ditemukan = true;
                System.out.println("Angka ditemukan pada index ke-" + i);
                break;
            }
        }
        if(!ditemukan) {
            System.out.println("Angka tidak ditemukan dalam array!");
        }
    }
}
