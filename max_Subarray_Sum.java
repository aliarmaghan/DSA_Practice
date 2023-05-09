import java.util.*;



public class max_Subarray_Sum{
    public static void main(String args[]){
        //int n[] = {1,-2,6,-1,3};
        //int num [] = {-2,-3,4,-1,-2,1,5,-3};
        //int num[] = {-13,-21,-31,-14,};
        int num[] = {-1,2,-5,4,-7};
        kadanesSum(num);
    }
    public static void prefix_Sum(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [n.length];

        //prefix arrray Calculation
        prefix[0] = n[0];
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] +n[i];
        }


        for (int i=0; i<n.length; i++){
            int start = i;
            for(int j=i; j<n.length; j++){
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " +maxSum);
    }
    public static void kadanesSum(int num[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for (int j=0; j<num.length; j++){
            if (num[j] < 0){
                ms = Math.max(num[j], ms);
            }
            else{
                for(int i=0; i<num.length; i++){
                    cs = cs +num[i];
        
                    if(cs < 0){
                        cs = 0;
                    }
        
                    ms = Math.max(cs,ms);
                }
            }
        
        System.out.println("Max value of subarray = " +ms);
        }
    }
}    
