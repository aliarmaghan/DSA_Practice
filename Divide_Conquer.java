public class Divide_Conquer {
    // MERGE SORT--------------------------------------------------------------------------------------------------------------------------------------------------
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid, int ei){
        int temp[] = new int [ei -si +1];
        int i = si;         //iterator for left part 
        int j = mid+1;      //iterator for right part
        int k = 0;          //iterator for temp arr
        
        while(i <= mid && j<=ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Remaining left part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        // Remaining Right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    //  QUICK SORT-----------------------------------------------------------------------------------------------------------------------------------
    public static void quickSort(int arr[],int si,int ei) {
        if(si >= ei){
            return;
        }
        //last element
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);     //left part sort
        quickSort(arr, pidx+1, ei);     //Right part Sort
    }
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;   // to make place for els smaller than pivot

        for(int j=si; j<ei; j++) {
            if(pivot >= arr[j]) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    //Search in Rotated sorted Array-------------------------------------------------------------------
    public static int Search(int arr[],int tar, int si ,int ei) {
        //base case 
        if(si > ei){
            return -1;
        }
        //mid 
        int mid = si +(ei - si)/2;

        //target found at mid
        if(arr[mid] == tar ){
            return mid;
        }

        //case 1 : mid on L1
        if(arr[si] <= arr[mid]) {
            //case a : left search before mid
            if(arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, tar, si, mid-1);
            } else {        //Right search after mid
                return Search(arr, tar, mid+1, ei);
            }
        } 


        // case 2: mid on L2
        else {
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid+1, ei);
            } else {
                return Search(arr, tar, mid-1, si);
            }
        }
    }


    public static void main(String[] args) {
        // int arr[] = {6,3,9,5,2,8,-5};
        // quickSort(arr, 0, arr.length-1);
        // printArr(arr);

        //For Search in rotated Sorted array
        int arr[] ={4,5,6,7,0,1,2};
        int tar = 6;
        int tarIdx = Search(arr, tar, 0, arr.length-1);
        System.out.println("Target index is = " +tarIdx);
    }
}

