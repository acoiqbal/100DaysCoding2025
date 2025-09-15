public class Day8 {
    public static void main(String[] args) {
        String kalimat = "Hai, nama saya Aco Iqbal dari Prodi Informatika";

        System.out.println("Kalimat asli: " + kalimat);
        System.out.println("------------------------------------");

        // 1. Menggunakan length() untuk panjang kalimat
        int panjangkalimat = kalimat.length();
        System.out.println("Panjang kalimat: " + panjangkalimat + " Huruf");

        // 2. Menggunakan toUpperCase() untuk mengubah menjadi huruf besar
        String hurufbesar = kalimat.toUpperCase();
        System.out.println("Huruf besar: " + hurufbesar);

        // 3. Menggunakan toLowerCase() mengubah menjadi huruf kecil
        String hurufkecil = kalimat.toLowerCase();
        System.out.println("Huruf kecil: " + hurufkecil);

        // 4. Menggunakan contains() untuk mencari kata
        boolean adakataAco = kalimat.contains("Aco");
        System.out.println("Apakah kalimat di atas ada kata 'Aco'? " + adakataAco);
        // 5. Menggunakan substring() untuk memotong teks
        String potongan = kalimat.substring(14, 18);
        System.out.println("Potongan kalimat: " + potongan);

        // 6. Menggunakan charAt() untuk mencari huruf pertama atau indeks ke berapa
        char hurufpertama = kalimat.charAt(0);
        System.out.println("Huruf pertama: " + hurufpertama);
    }
}
