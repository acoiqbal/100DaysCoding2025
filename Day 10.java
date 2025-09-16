public class Day10 {
    public static void main(String[] args) {
        /* variabel ANGKA tidak di bisa di update karena
        Konstanta/variabel yang nilainya tidak dapat diubah
        sedangkan untuk variabel angka bisa di update karena
        variabelnya tidak konstanta.*/
        final int ANGKA = 10;
        int angka = 20;

        angka = 5;

        System.out.println(ANGKA);
        System.out.println(angka);
    }
}
