import java.util.*;


public class fnBinToDec{
    public static void Bintodec(int n){
        int mynumber =n;
        int pow = 0;
        int dec = 0;


        while(n >0) {
            int ld = n % 10;
            dec = dec + (ld * (int)Math.pow(2,pow));

            pow++;
            n = n/10;
        }
        System.out.println("decimal of " + mynumber +" = " +dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bintodec(n);
    }
}
