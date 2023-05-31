public class recursionAssignment{
    //Q.1>>
    public static int allOccurance(int arr[],int ind,int key){
        if(ind == arr.length){
            return -1;
        }
        if(arr[ind] == key){
            System.out.print(ind+",");
        }
        return allOccurance(arr,ind+1,key);
    }
    //Q.2>>
    public static void noToWOrd(int n){
        String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n == 0){
            return;
        }
        int ld = n%10;
        noToWOrd(n/10);
        System.out.print(digit[ld]+" ");
    }
    //Q.3>>
    public static int stringLength(String str) {
        if(str.length() == 0){
            return 0;
        }
        return stringLength(str.substring(1)) +1;
    }
    //Q.4>>
    public static int countsubstrs(String str , int i,int j,int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        int res = countsubstrs(str,i+1,j,n-1) + countsubstrs(str,i, j-1, n-1) +countsubstrs(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)){
            res ++;
        }
        return res;
    } 
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(stringLength(str));
    }
}