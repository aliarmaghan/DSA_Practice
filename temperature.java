import java.util.*;


public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        
        //double temp = 103.5;


        if (temp > 100) {
            System.out.println("you have fever");
        } else {
            System.out.println("you don't have fever");
        }
    }
}