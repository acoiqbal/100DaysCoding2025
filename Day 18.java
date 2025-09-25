public class Day18 {
    public static void main(String[] args) {
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("byte ke short : " + b);
        System.out.println("short ke int  : " + c);
        System.out.println("int ke long   : " + d);
        System.out.println("long ke float : " + e);
        System.out.println("float ke double : " + f);
    }
}
