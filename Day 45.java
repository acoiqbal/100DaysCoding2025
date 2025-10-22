    import java.util.Scanner;
    
    public class Day45 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Masukkan Nilai : ");
            int a = sc.nextInt();
            char predikat;
    
            switch (a / 10) {
                case 9:
                    predikat = 'A';
                    break;
                case 8:
                    predikat = 'B';
                    break;
                case 7:
                    predikat = 'C';
                    break;
                case 6:
                    predikat = 'D';
                    break;
                default:
                    predikat = 'E';
                    break;
            }
    
            System.out.println("Nilai : " + a);
            System.out.println("Predikat : " + predikat);
        }
    }
