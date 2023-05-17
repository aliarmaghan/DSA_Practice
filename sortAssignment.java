import java.util.*;


public class sortAssignment{
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            // Finding Smallest number
            int small = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[small]){
                    small = j;
                }
            }
            // Swaping it at begining
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int cur = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < cur){
                arr[prev + 1] = arr [prev];
                prev--;
            }
            arr[prev + 1] = cur;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr);
        printArray(arr);
    }
}