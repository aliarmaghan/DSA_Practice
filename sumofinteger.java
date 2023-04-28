import java.util.*;


public class sumofinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sumofeven =0;
        int sumofodd = 0;
        for (int c=1; c<=10; c++) {
            int n = sc.nextInt();
            if (n % 2==0) {
                sumofeven = sumofeven + n;
            } else {
                sumofodd = sumofodd + n;
            }
        }
        System.out.println("sum of all even integer = " +sumofeven);
        System.out.println("sum of all odd integer = " +sumofodd);
    }
}