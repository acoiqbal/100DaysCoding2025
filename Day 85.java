public class Main {
    public static void main(String[] args) {

        int[] angka = {12, 45, 23, 89, 34, 78};
        
        int max = angka[0];
        
        for(int i = 1; i < angka.length; i++) {
            if(angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Angka terbesar dalam array adalah: " + max);
    }
}
