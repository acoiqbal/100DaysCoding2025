import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        String nama;
        String nim;
        int usia;
        char kelas;
        double tinggi;
        
       Scanner input = new Scanner(System.in);
       System.out.print("Nama :");
       nama = input.nextLine();
        
        System.out.print("Nim :");
       nim = input.nextLine();
        
       System.out.print("Usia :");
       usia = input.nextInt();
        
        System.out.print("Kelas :");
       kelas = input.next().charAt(0);
        
        System.out.print("Tinggi :");
       tinggi = input.nextDouble();
        
     }

}
