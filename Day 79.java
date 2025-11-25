import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== BUAT AKUN BARU ===");
        System.out.print("Masukkan username baru: ");
        String username = sc.nextLine();

        System.out.print("Masukkan password baru: ");
        String password = sc.nextLine();

        System.out.println("\nAkun berhasil dibuat!\n");
        
        String userLogin, passLogin;

        do {
            System.out.println("=== LOGIN ===");
            System.out.print("Username: ");
            userLogin = sc.nextLine();

            System.out.print("Password: ");
            passLogin = sc.nextLine();

            if (username.equals(userLogin) && password.equals(passLogin)) {
                System.out.println("\nLogin berhasil! Selamat datang, " + username);
            } else {
                System.out.println("\nUsername atau password salah! Coba lagi.\n");
            }
        } while (!username.equals(userLogin) || !password.equals(passLogin));
    }
}
