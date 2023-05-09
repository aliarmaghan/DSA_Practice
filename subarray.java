import java.util.*;


public class subarray{
    public static void main(String args[]){
        int a[] = {1,-2,6,-1,3};
        sub_Array(a);
    }
    public static void sub_Array(int a[]){
        int ts =0;
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            int start = i;
            int sum = 0;
            for(int j=i; j<a.length; j++){
                int end = j;
                for(int k=i; k<=j; k++){
                    System.out.print(a[k] +" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
            for(int l=i; l<a.length; l++){
                sum = sum +a[l];
                System.out.println("sum of subarray is = " +sum);
                if(max < sum){
                    max = sum;
                }
            }
            
        }
        System.out.println("Max.value of all subarray =  " +max);
        System.out.println("Total subarrays = " +ts);
    }
}