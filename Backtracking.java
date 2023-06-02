public class Backtracking {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void changeArr(int arr [], int i, int val) {
        if (i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] -2;
    }
    public static void findSubsets(String str, String ans , int i) {
        //Base case
        if(i == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
            } else{
                System.out.println(ans);
            }
            return;
        }

        //yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //No Choice
        findSubsets(str, ans, i+1);
    }
    public static void findPermutation(String str, String ans) {
        //base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static int gridWays(int i, int j, int m, int n) {
        if(i==m-1 && j==n-1) {
            return 1;
        }
        //corner case
        else if(i == n || j == n) {
            return 0;
        }
        int w1 = gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);

        return w1 + w2;
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0,1 );
        // printArr(arr);
        // String str = "abc";
        // findPermutation(str, " ");
        int n = 4, m = 4 ;
        System.out.println(gridWays(0, 0, m, n));

    }
}