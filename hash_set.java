import java.util.HashSet;
import java.util.Iterator;


public class hash_set{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(11);
        set.add(12);
        set.add(132);
        set.add(12);

        //search - contains
        if (set.contains(11)){
            System.out.println("yes set contain 11");
        }
        if (!set.contains(1221)){
            System.out.println("absent");
        }

        //Size
        System.out.println("Size of set = " +set.size());


        //print

        System.out.println(set);

        //Delete

        // set.remove(12);
        // if(!set.contains(12)){
        //     System.out.println("we removed it");
        // }
        
        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}