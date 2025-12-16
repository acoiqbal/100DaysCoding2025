import java.util.Scanner;
import java.util.Arrays;

public class Day100 {
    private static final int MAX_DATA = 5;

    private static String[] dataList = new String[MAX_DATA];

    private static int size = 0;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan Anda (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    createData();
                    break;
                case 2:
                    readData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("\nTerima kasih, program dihentikan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    private static void tampilkanMenu() {
        System.out.println("\n=============================");
        System.out.println("  SIMULASI CRUD MENGGUNAKAN ARRAY");
        System.out.println("=============================");
        System.out.println("1. Create (Tambah Data)");
        System.out.println("2. Read (Lihat Data)");
        System.out.println("3. Update (Ubah Data)");
        System.out.println("4. Delete (Hapus Data)");
        System.out.println("5. Keluar");
        System.out.println("-----------------------------");
    }

    private static void createData() {
        System.out.println("\n--- 1. TAMBAH DATA (CREATE) ---");

        if (size >= MAX_DATA) {
            System.out.println("ERROR: Array sudah penuh (" + MAX_DATA + " data). Tidak dapat menambah data lagi.");
            return;
        }

        System.out.print("Masukkan data baru: ");
        String newData = sc.nextLine();

        dataList[size] = newData;

        size++;

        System.out.println("SUCCESS: Data berhasil ditambahkan di indeks " + (size - 1));
    }

    private static void readData() {
        System.out.println("\n--- 2. LIHAT DATA (READ) ---");

        if (size == 0) {
            System.out.println("INFO: Daftar data kosong.");
            return;
        }

        System.out.println("Daftar Data (" + size + " dari " + MAX_DATA + " terisi):");

        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "] " + dataList[i]);
        }
    }

    private static void updateData() {
        System.out.println("\n--- 3. UBAH DATA (UPDATE) ---");
        readData();

        if (size == 0) return;

        System.out.print("Masukkan Indeks data yang ingin diubah (0 - " + (size - 1) + "): ");
        if (!sc.hasNextInt()) {
            System.out.println("ERROR: Input harus berupa angka indeks.");
            sc.nextLine();
            return;
        }
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= size) {
            System.out.println("ERROR: Indeks tidak valid.");
            return;
        }

        System.out.print("Masukkan nilai baru untuk indeks [" + index + "]: ");
        String newValue = sc.nextLine();

        dataList[index] = newValue;

        System.out.println("SUCCESS: Data pada indeks " + index + " berhasil diubah.");
    }

    private static void deleteData() {
        System.out.println("\n--- 4. HAPUS DATA (DELETE) ---");
        readData();

        if (size == 0) return;

        System.out.print("Masukkan Indeks data yang ingin dihapus (0 - " + (size - 1) + "): ");
        if (!sc.hasNextInt()) {
            System.out.println("ERROR: Input harus berupa angka indeks.");
            sc.nextLine();
            return;
        }
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= size) {
            System.out.println("ERROR: Indeks tidak valid.");
            return;
        }

        String deletedValue = dataList[index];

        for (int i = index; i < size - 1; i++) {
            dataList[i] = dataList[i + 1];
        }

        size--;

        dataList[size] = null;

        System.out.println("SUCCESS: Data '" + deletedValue + "' pada indeks " + index + " berhasil dihapus.");
    }
}
