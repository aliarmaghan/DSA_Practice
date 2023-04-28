import java.util.*;


public class calculation {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("PLEASE ENTER THE OPERATOR");
        char operator =  sc.next().charAt(0);
        System.out.println("Enter another number");
        int b = sc.nextInt();
        
        


        switch (operator) {
            case '+' : System.out.println(a + b);
                break;
            case '-' : System.out.println(a - b);
                break;
            case '*' : System.out.println(a * b);
                break;
            case '/' : System.out.println(a / b);
                break;
            case '%' :System.out.println(a % b);
                break;
            default: System.out.println("ERROR 404 '~'");
                break;
        }
    }
}