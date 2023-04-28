import java.util.*;


class largestofthem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a > b && b > c) {
            System.out.println("LARGEST NUMBER IS= "+a);
        } else if (b > a && a > c) {
            System.out.println("LARGEST NUMBER IS= "+b);
        } else{
            System.out.println("LARGEST NUMBER IS= "+c);
        }
    }
}