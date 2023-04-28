import java.util.*;


public class positivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        
        if (a < 0) {
            System.out.println("number is negative ");
        } else if(a > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("zero neither be positive nor negative");
        }
    }
}