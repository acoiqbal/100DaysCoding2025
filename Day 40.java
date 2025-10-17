import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan Angka : ");
        double angka2 = sc.nextDouble();
        System.out.print("Masukkan Operator : ");
        char operator = sc.next().charAt(0);
        double hasil = 0;

        System.out.println("Menghitung: " + angka1 + " " + operator + " " + angka2);
        
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2;
        } else if (operator == '%') {
            hasil = angka1 % angka2;
        }else {
            System.out.println("Operator yang anda masukkan tidak ada");
        }

        System.out.println("Hasil : " + hasil);
    }
}
