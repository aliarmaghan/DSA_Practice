import java.util.*;


class traping_rainwater{
    public static void traped_water(int height[]){
        // calculation of left max boundary

        int leftMax [] = new int [height.length];
        leftMax[0] = height[0];
        for (int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        //calculation of right max boundary

        int rigthMax[] = new int [height.length];
        rigthMax[height.length-1] = height[height.length-1];
        for (int i=height.length-2; i>=0; i--){
            rigthMax[i] = Math.max(height[i] , rigthMax[i+1]);
        } 
        
        //Loops
        int trappedwater = 0;
        for (int i=0; i<height.length; i++){
            int waterlevel = Math.min(leftMax[i],rigthMax[i] );
            trappedwater += waterlevel - height[i];
        }
        System.out.println(trappedwater);
    }
    public static void main(String args[]){
        int height [] = {6,3,7,2,0,5};
        traped_water(height);

    }
}
