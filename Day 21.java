import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sebelum di tukar = ");
        int a = sc.nextInt();
        System.out.print("Sebelum di tukar = ");
        int b = sc.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
                
        System.out.println("--------------------------");
        System.out.println("Sesudah di tukar = " + a);
        System.out.println("Sesudah di tukar = " + b);
    }
}
