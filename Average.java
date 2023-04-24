import java.util.*;


public class Average {
    public static void main(String []args) {
        System.out.println("enter three number");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Float avg = (A + B + C) / 3f;
        System.out.println(avg);
    }
}
