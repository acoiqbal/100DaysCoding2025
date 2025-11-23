public class Day77 {
    public static void main(String[] args) {

        String kalimat = "  Hai saya Aco  ";
        
        System.out.println("substring(): " + kalimat.substring(8, 12));
        
        System.out.println("replace(): " + kalimat.replace("Aco", "Iqbal"));
        
        System.out.println("Sebelum trim: [" + kalimat + "]");
        System.out.println("Sesudah trim: [" + kalimat.trim() + "]");
    }
}
