import java.util.*;


public class fnDecToBin {
    public static void dectobin(int n) {
        int f_n = n;
        int pow = 0;
        int bin = 0;


        while (n>0) {
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n /= 2; 
        }
        System.out.println("Binary of "+f_n+" = "+bin);
    }
    public static void main(String[] args) {
        dectobin(5); 
    }
}