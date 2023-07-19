import java.util.*;

public class Queue_Assignment {
    public static void bin_dec_1_N(int n){
        Queue <String> q = new LinkedList<>();

        // int bin=0;
        // int pow = 1;
        // for(int i=1; i<=n; i++) {
        //     while(i>0) {
        //         int rem = i % 2;
        //         bin = bin + (rem * (int)Math.pow(10,pow));
        //         pow++;
        //         i/=2;
        //     }
        //     q.add(bin);
        // }
        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        q.add("1");
        while(n-->0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
    public static void main(String [] args){
        int n = 4;
        bin_dec_1_N(n);
        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }
    }
}