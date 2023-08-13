import java.util.*;

public class Chocolate_Distribution_Prob{
    public static int findMinDiff(int arr[], int m){
        Arrays.sort(arr);
        int n = arr.length;
        int idx = 0;
        int minDiff = Integer.MAX_VALUE;
        int diff = 0;
        while((idx+m-1) <= n){
            diff = arr[(idx + m-1)] - arr[idx];
            minDiff = Math.min(diff, minDiff);
            i++;
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int arr[] = {7,3,2,4,9,12,56};
        int m = 3;
        System.out.println(findMinDiff(arr,m));
    }
}