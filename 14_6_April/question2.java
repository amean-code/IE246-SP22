public class question2 {
    
    public static void main(String[] args) {
        System.out.println(padString("gokce", 10));
    }

    public static String padString(String x, int lenght) {
        if (x.length()<lenght) {
            lenght-=x.length();
            for (int i = 0; i < lenght; i++) {
                x=" "+x;
            }
        } 
        return x;
    }
}
