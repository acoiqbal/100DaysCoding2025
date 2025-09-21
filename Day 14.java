public class Main {
    
    public static void main(String[] args) {
        String a = "123";
        String b = "3.14";
        String c = "true";
        
        a = "120";
        b = "2.34";
        c = "false";
        
        int d = Integer.parseInt(a);
        byte e = Byte.parseByte(a);
        short f = Short.parseShort(a);
        long g = Long.parseLong(a);
        
        double h = Double.parseDouble(b);
        float i = Float.parseFloat(b);
            
        boolean j = Boolean.parseBoolean(c);

        // Menampilkan hasil konversi
        System.out.println("D = " + d);
        System.out.println("E = " + e);
        System.out.println("F = " + f);
        System.out.println("G = " + g);
        
        System.out.println("H = " + h);
        System.out.println("I = " + i);
        
        System.out.println("J = " + j);
        
        System.out.println("Sekian");
    }
}
