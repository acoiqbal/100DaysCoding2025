import java.util.Scanner;
public class Day13 {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Soal 1");
    final short tahunsaatini;
  
        tahunsaatini = sc.nextShort();
        short tahundepan = sc.nextShort();
        int tahunlalu = sc.nextInt();

        System.out.printf("Saat ini tahun %d",tahunsaatini);
        System.out.println("\nJadi tahun kemarin adalah " +tahunlalu);
        System.out.println("tahun depan berarti " + tahundepan);

        System.out.print(tahunlalu);
        System.out.print("," + tahunsaatini);
        System.out.print("," + tahundepan);

        System.out.println("Soal 2");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("sebelum di shuffle A = " + a + ", B = " + b + ", C = " + c);

        int d;
        d = a;
        a = c;
        c = b;
        b = d;

        System.out.println("setelah di shuffle A = " + a + ", B = " + b + ", C = " + c);

        System.out.println("Soal 3");
        byte merah = sc.nextByte();
        short hijau = sc.nextShort();
        int biru = sc.nextInt();

        System.out.printf("%d",merah);

        hijau = merah;
        System.out.print("-> " + hijau);

        biru = hijau;
        System.out.println(" -> " + biru);
    }
  }
