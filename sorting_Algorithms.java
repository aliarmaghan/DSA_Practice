import java.util.*;
import java.util.Collections;


public class sorting_Algorithms {
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSorting(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            //swap 
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >=0 && arr[prev] > curr) {  
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] =curr;
        }
    }
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        Integer arr[] = {25,45,41,11,56,13,10};
        //int arr[] = {5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}