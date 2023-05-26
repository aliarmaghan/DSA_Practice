public class RecursionBasic{
    public static void printDecr(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecr(n-1);
    }
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+ " ");
            return;
        }
        printInc( n - 1);
        System.out.print(n + " ");
    }
    public static int fact(int n){
        if(n== 0){
            return 1;
        }
        int fac = fact(n-1);
        int fn = n * fac;
        return fn;
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int s = sum(n-1);
        int sum = n + s;
        return sum;
    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1 ){
            return  n;
        }
        int fibNm1 = fibonacci(n-1);
        int fibNm2 = fibonacci(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);

    }
    public static int firstOccurance(int arr[],int i,int key){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
        
        
    }
    public static int  lastOccurance(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(arr[i] == key && isFound == -1){
            return i;
        }
        return isFound;
    }
    public static int power(int x , int n ){
        if(n == 1){
            return x;
        }
        // int store = power(x, n-1);
        // int res = x * store;
        // return res;
        return x * power(x, n-1);
    }
    public static int optimizedPower(int a, int n){
        if( n==0 ){
            return 1;
        }
        int halfPow = optimizedPower(a, n/2);
        int halfPowSq = halfPow * halfPow;

        // n is odd
        if( n % 2 != 0){
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }
    public static int tilesProblems(int n){
        //Base case
        if( n == 0 || n == 1){
            return 1;
        }

        //work for vertical case

        int fNm1 = tilesProblems(n-1);

        //work for horizontal case

        int fNm2 = tilesProblems(n-2);
        int totalWays = fNm1 + fNm2;
        return totalWays;
    }
    public static void removeDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicate(str, idx+1, newstr, map);
        } else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newstr.append(currChar), map);
        }
    }
    public static int friendsPairing(int n){
        if(n == 2 || n == 1){
            return n;
        }
        int single = friendsPairing(n-1);

        int pair = single*friendsPairing(n-2);

        int ways = single + pair;
        return ways;
    }
    public static void printBinString(int n,int lastPlace,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        // if(lastPlace == 0){
        //     printBinString(dig-1,0,str+"0");
        //     printBinString(dig-1,1,str+"1");
        // } else {
        //     printBinString(dig-1,0,str+"0");
        // }
        printBinString(n-1,0,str+"0");
        if(lastPlace == 0) {
            printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        // int arr []= {8,3,6,9,5,10,2,5,3};
        //System.out.println(tilesProblems(2));
        // String str = "appnnacollege";
        // removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
        //System.out.println(friendsPairing(4));
        printBinString(3, 0,"");
    } 
}