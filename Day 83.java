public class Day84 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        System.out.println("total penjumlahan : " + total);
    }
}
