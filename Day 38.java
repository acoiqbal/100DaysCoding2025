import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Input : ");
        int a = sc.nextInt();

        if (a > 0){
            System.out.println("ini adalah bilangan positif");
        } else if (a < 0) {
            System.out.println("ini adalah bilangan negatif");
        }else {
            System.out.println("ini adalah nol");
        }
    }
}
