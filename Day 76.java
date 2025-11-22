public class Main {
    public static void main(String[] args) {

        String a = "Halo";
        String b = "HALO";
        String c = "";
        String nama = "Aco Iqbal";

        System.out.println("equals()          : " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));
        System.out.println("contains()        : " + nama.contains("Iqbal"));
        System.out.println("isEmpty()         : " + c.isEmpty());
    }
}
