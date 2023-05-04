import java.util.*;

public class fnfactorial {
    public static int factorial(int n) {
        int mul = 1;
        for (int i=1; i<=n; i++) {
            mul = mul * i;
        }
        return mul;
    }
    public static int binoCoeff(int n,int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);


        int binoCoeff = fact_n / (fact_r * fact_nmr);
        return binoCoeff;
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int r = sc.nextInt();
    //     System.out.println("Factorial of number = " +binoCoeff(n, r));
    // }
        /*  CHECKING
            NUMBER IS
            PRIME OR 
            NNOT
         */
        public static boolean isprime (int n) {
            for (int i=2; i<=n-1; i++) {
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
        public static void primeInRange(int n) {
            for (int i =2; i<=n; i++) {
                if (isprime(i)) {
                    System.out.print(i+ " ");
                }
            }
    
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //System.out.println(isprime(n));
            primeInRange(n);
        }

}
