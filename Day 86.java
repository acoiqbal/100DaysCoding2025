public class Main {
    public static void main(String[] args) {

        int[] angka = {39, 45, 23, 89, 10, 78};
        
        int min = angka[0];
        
        for(int i = 1; i < angka.length; i++) {
            if(angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka terkecil dalam array adalah: " + min);
    }
}
