import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Assignment{
    public static boolean monotonic(ArrayList<Integer> list) {
        boolean forw = true;
        boolean back = true;
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                forw = false;
            }
            if(list.get(i) < list.get(i+1)) {
                back = false;
            }
        }
        return forw || back;
    }
    public static ArrayList<Integer> lonely_Els (ArrayList <Integer> num) {
        Collections.sort(num);
        ArrayList <Integer> list = new ArrayList<>();
        // int i = 0;
        // for(int j=1; j<num.size()-1; j++) {
        //     if(num.get(i) == num.get(j)) {
        //         i++;
        //     }
        //     else if(num.get(i)+1 != (num.get(j)+1)) {
        //         list.add(list.get(i));
        //         i++;
        //     }
        //     else if(num.get(i)-1 != num.get(j)-1) {
        //         list.add(list.get(i));
        //         i++;
        //     } else {
        //         i++;
        //     }
        // }
        // return list;
        for(int i=1; i<num.size()-1; i++) {
            if(num.get(i-1)+1 < num.get(i) && num.get(i)+1 < num.get(i+1)) {
                list.add(num.get(i));
            }
        }
        if(num.size() == 1) {
            list.add(num.get(0));
        }
        if(num.size() > 1) {
            if(num.get(0)+1 < num.get(1)){
                list.add(num.get(0));
            }
            if(num.get(num.size()-2) +1 < num.get(num.size()-1)) {
                list.add(num.get(num.size()-1));
            }
        }
        return list; 
    }
    public static int most_freq_number(ArrayList <Integer> nu , int key){
        // int count =0; 
        // for(int i=0; i<nu.size(); i++) {
        //     if(nu.get(i) == nu.get(key)) {
        //         count++;
        //     }
        // }
        // return count;
        int [] result = new int[1000];

        for(int i=0; i<nu.size()-1; i++) {
            if(nu.get(i) == key) {
                result[nu.get(i+1) -1]++;
                System.out.println(result);

            }
        }
        int max =Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++) {
            if(result[i] > max) {
                max =result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        // Q.1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(monotonic(list));

        // Q.2 
        ArrayList <Integer> num = new ArrayList<>();
        num.add(3);
        num.add(2);
        num.add(12);
        num.add(21);

        System.out.println(lonely_Els(num));

        // Q.3
        ArrayList <Integer> nu = new ArrayList<>();
        nu.add(1);
        nu.add(100);
        nu.add(200);
        nu.add(1);
        nu.add(100);

        System.out.println(most_freq_number(nu, 1));
    }
}