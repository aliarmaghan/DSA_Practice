import java.util.*;


public class reverseofnumber {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while ( n > 0 ) {
            int last = n % 10;
            System.out.print(last);
            n = n / 10; // n /= 10
        }
    }
}