import java.util.*;


public class breaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();


        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if( i == 4 ) {
                break;
            }
        } System.out.println("i m out");
    }
}