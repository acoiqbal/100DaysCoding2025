public class Main {
    
    public static int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {

        int s = 5; 

        int hasil = hitungLuas(s);

        System.out.println("Luas persegi dengan sisi " + s + " adalah: " + hasil);
    }
}
