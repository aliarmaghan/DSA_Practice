import java.util.*;


public class binary_search{
    public static void main(String args[]){
        int x [] = {2,4,6,8,10};
        pair_Number(x);
    }
    public static int binary_Search(int n[], int key){
        int start = 0;
        int end = n.length -1;
        while(start <= end){
            int mid =(start +end) / 2;
            if (n[mid] == key){
                return mid;
            }
            if(n[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void reverse_array(int a[]){
        int start = 0;
        int end = a.length-1;
        while(start < end){
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp; 
            
            start++;
            end--;
        
        }
    }
    public static void pair_Number(int a[]){
        for(int i =0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                System.out.print("("+ a[i]+","+ a[j]+")");
            }
            System.out.println();
        }
    } 
}
