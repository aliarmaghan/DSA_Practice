import java.util.*;


public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i=1; i<=10; i++) {
            int table = n * i;
            System.out.println(table);
        }
        System.out.println(i);
    }
}