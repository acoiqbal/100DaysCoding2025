import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0); 
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        
        double hasil = 0;
        
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;

            case '-':
                hasil = angka1 - angka2;
                break;

            case '*':
                hasil = angka1 * angka2;
                break;

            case '/':
                hasil = angka1 / angka2;
                break;

            default:
                System.out.println("Error: Operator tidak dikenal!");
                break;
        }
        
        System.out.println("hasil = " + hasil);
    }
}
