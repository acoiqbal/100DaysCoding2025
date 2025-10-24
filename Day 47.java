import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukkan angka : ");
        int a = sc.nextInt();
        
        String namaHari;
        
        switch (a) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Tidak valid";
                break;
        }
        
        System.out.println("Nomor hari: " + a);
        System.out.println("Itu adalah hari: " + namaHari);
    }
}
