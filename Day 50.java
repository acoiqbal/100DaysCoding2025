import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka : ");
        int a = sc.nextInt();
        
        String keterangan = (a % 2 == 0) ? "Genap" : "Ganjil";
        
        System.out.println(a + " adalah " + keterangan);
    }
}
