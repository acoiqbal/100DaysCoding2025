public class Day34 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean hasil;

        int tambah = a + b;
        int kali = a * b;

        hasil = (a > b) && (b < 5);

        b++;
        a--;

        System.out.println("hasil tambah : " + tambah);
        System.out.println("hasil kali : " + kali);
        System.out.println("hasil logika : " + hasil);
        System.out.println("hasil increment : " + b);
        System.out.println("hasil decrement : " + a);
    }
}
