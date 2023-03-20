import java.util.ArrayList;

public class Arraylist1{
    public static int stored_Water(ArrayList <Integer> ht) {
        // Broute force O (n^2)
        // int maxWater = 0;
        // for(int i=0; i<ht.size(); i++) {
        //     for(int j=i+1; j<ht.size(); j++){
        //         int height = Math.min(ht.get(i), ht.get(j));
        //         int width = j-i;
        //         int currWaterStored = height * width; 
        //         maxWater = Math.max(maxWater, currWaterStored);
        //     }
        // }
        // return maxWater;

        //--------2 pointer Approach-------O(n)

        int maxiWater =0;
        int lp =0 , rp = ht.size()-1;
        while(lp < rp) {
            int heights = Math.min(ht.get(rp),ht.get(lp));
            int widths = rp - lp;
            int currWater = heights * widths;
            maxiWater = Math.max(maxiWater, currWater);
            if(ht.get(lp) < ht.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxiWater;
    }
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        // Brute Force Approach --- O(n^2)
        int sum =0;
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    System.out.println(list.get(i) +" "+ list.get(j));
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean pairSum1AnotherApproach(ArrayList<Integer> list, int target){
        int lp=0 , rp = list.size()-1;
        while(lp!=rp) {
            int sum = list.get(lp) + list.get(rp);
            // Case 1
            if(sum == target) {
                System.out.println(list.get(lp) +" "+ list.get(rp));
                return true;
            }
            // Case 2
            else if (sum < target) {
                lp++;
            }
            // Case 3 
            else {
                rp--;
            }
        }
        return false;
    }
    public static boolean pairSum2(ArrayList<Integer> rcrd, int target) {
        int bp = -1;
        for( int i=0; i<rcrd.size(); i++) {
            if(rcrd.get(i) > rcrd.get(i+1)) {
                bp = i;
                break;
            }
        }
        int rp = bp , lp = bp+1 , n = rcrd.size();
        while(lp != rp) {
            if(rcrd.get(lp) + rcrd.get(rp) == target) {
                return true;
            } 
            else if(rcrd.get(lp) + rcrd.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList <Integer> ht = new ArrayList<>();
        // ht.add(1); 
        // ht.add(8); 
        // ht.add(6);
        // ht.add(2);
        // ht.add(5);    
        // ht.add(4);      
        // ht.add(8);           
        // ht.add(3);    
        // ht.add(7);

        // System.out.println(stored_Water(ht));

        // // Q-2 
        // ArrayList <Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 5;
        // System.out.println(pairSum1(list, target)); 
        // System.out.println(pairSum1AnotherApproach(list, target)); 

        // Q-3
        ArrayList<Integer> rcrd = new ArrayList<>();
        rcrd.add(11);
        rcrd.add(15);
        rcrd.add(6);
        rcrd.add(8);
        rcrd.add(9);
        rcrd.add(10);
        
        int tar = 16;
        System.out.println(pairSum2(rcrd, tar));

    }
}