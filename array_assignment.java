import java.util.*;


public class array_assignment{
    // QUE 1:-}
    public static boolean appear_twice(int arr[]){
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                } 
            }       
        }
        return false;

        //TIME COMPLEXITY = 0(N^2)
    }

    // QUE 3:-}
    public static int prices(int price[]){
        int buy_price = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if(buy_price < price[i]){
                int profit = price[i] - buy_price;
                maxProfit = Math.max(profit , maxProfit);
            } else{
                buy_price = price[i];
            }
        }
        return maxProfit;
    }

    // QUE :- 4
    public static int water_store(int elevation[]){
        int lmb [] = new int [elevation.length];
        lmb[0] = elevation[0];
        for(int i=1; i<elevation.length; i++){
            lmb[i] = Math.max(elevation[i],lmb[i-1]);
        }
        int rmb [] = new int [elevation.length];
        rmb[elevation.length-1] = elevation[elevation.length-1];
        for(int i=elevation.length-2; i>=0; i--){
            rmb [i] = Math.max(elevation[i], rmb[i+1]);
        }
        int trapedwater = 0;
        for(int i=0; i<elevation.length; i++){
            int wl = Math.min(lmb[i],rmb[i]);
            trapedwater += wl - elevation[i];
        }
        return trapedwater;
    }


    public static void main(String args[]){
        int elevation [] = {4,2,0,3,2,5};
        System.out.println(water_store(elevation));
    }
}