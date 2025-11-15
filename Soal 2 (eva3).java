import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a == b && b == c && c == d) {
                System.out.println("PERSEGI");
            } else {
                System.out.println("Tidak Mungkin");
            }
        }
    
    }
}
