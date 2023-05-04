import java.util.Scanner;

public class basicfunction {
    public static void printhelloworld() {
        System.out.println("HEllo wolrd");
        System.out.println("HEllo wolrd");
        System.out.println("HEllo wolrd");
    }
    public static int calculatesum(int num1 , int num2) {
        
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        printhelloworld();  //function call

        //
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a , b);
        System.out.println("sum is :" + sum);
    }
}