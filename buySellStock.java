import java.util.*;


public class buySellStock{
    public static int BuySellCall(int price[]){
        int maxProfit = 0;
        int mini_buying_price = Integer.MAX_VALUE;
        for (int i=0; i<price.length; i++) {
            if (mini_buying_price < price[i]){
                int profit = price[i] - mini_buying_price;
                maxProfit = Math.max(profit , maxProfit);

            }else{
                mini_buying_price = price[i];
            }
        }
        return maxProfit;
    } 
    public static void main(String args[]){
        int price[] = {2,4,2,9,0,7};
        //int price [] = {7,1,5,3,6,4};
        System.out.println(BuySellCall(price));
    }

}