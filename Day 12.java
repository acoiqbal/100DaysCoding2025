import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("          BIODATA SEDERHANA   ");
        System.out.println("=====================================");

        String nama;
        String alamat;
        int usia;
        char jenisKelamin;
        double tinggi;
        boolean status;

        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("Alamat : ");
        alamat = input.nextLine();

        System.out.print("Usia : ");
        usia = input.nextInt();

        System.out.print("Jenis Kelamin : ");
        jenisKelamin = input.next().charAt(0);

        System.out.print("Tinggi : ");
        tinggi = input.nextDouble();

        System.out.print("Status Pernikahan : ");
        status = input.nextBoolean();

    }
}
