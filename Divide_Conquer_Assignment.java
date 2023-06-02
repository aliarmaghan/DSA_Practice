public class Divide_Conquer_Assignment{
    //Q.1>>
    public static void printArray(String arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +",");
        }
        System.out.println();
    }
    public static String[] alp_Merge_sort(String arr[], int si,int ei) {
        //base case
        if(si == ei) {
            String [] A = {arr[si]};
            return A;
        }
        int mid = si + (ei - si)/2;

        String arr1[] = alp_Merge_sort(arr, si ,mid);   
        String arr2[] = alp_Merge_sort(arr, mid+1, ei);
        String arr3[] = Merge(arr1,arr2);
        return arr3;
    }
    public static String[] Merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String [] temp = new String [m+n];

        int i = 0;
        int j= 0;
        int idx = 0;

        while(i < m && j < n) {
            if(isAlphabeticallySmaller(arr1[i],arr2[j])) {
                temp[idx] = arr1[i];
                i++;
            } else {
                temp[idx] = arr2[j];
                j++;
            }
            idx++;
        }
        while(i<m) {
            temp[idx++] = arr1[i++];
        }
        while(j<n) {
            temp[idx++] = arr2[j++];
        }
        return temp;
    }
    public static boolean isAlphabeticallySmaller(String str1,String str2) {
        if(str1.compareTo(str2)<0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // String arr[] = {"sun","earth","mars","mercury"};
        String arr[] = {"ali","insha","danish","prince","shoaib","izma","negar","rounak"};
        String[] a = alp_Merge_sort(arr, 0, arr.length -1);
        printArray(a);
    }
}