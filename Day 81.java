import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang", "Anggur"};

        System.out.print("Masukkan indeks (0 - 4): ");
        int index = sc.nextInt();
        
        if(index >= 0 && index < buah.length){
            System.out.println("Elemen pada indeks " + index + " adalah: " + buah[index]);
        } else {
            System.out.println("Indeks tidak valid! (Harus antara 0 - 4)");
        }
    }
}
