import java.util.*;


public class taxcalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        float tax = 0;
        if (i < 500000) {
            tax = 0;
            System.out.println("TAX IS=" +tax);
        } else if (i >= 500000 && i < 1000000) {
            tax = i * 0.20f;
            System.out.println("TAX IS=" +tax);
        } else {
            tax = i * .30f;
            System.out.println("TAX IS=" +tax);
        }
    }
}