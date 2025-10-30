public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Mengecek angka: " + i);
            
            if (i == 5) {
                System.out.println("Angka 5");
                break; 
            }
        }
        
        System.out.println("Perulangan dihentikan");
    }
}
