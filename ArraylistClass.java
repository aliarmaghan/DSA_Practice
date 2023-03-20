import java.util.ArrayList;

public class ArraylistClass {
    public static void operation() {
        //Add Element 
        rcrd.add(1);
        rcrd.add(2);
        rcrd.add(3);
        rcrd.add(4);
        rcrd.add(5);
        rcrd.add(2, 24);

        System.out.println(rcrd);

        //Get Element
        System.out.println(rcrd.get(2)); 
        System.out.println(rcrd.get(4));

        //Delete element
        rcrd.remove(1);
        System.out.println(rcrd);

        //Set element at index
        rcrd.set(0,45);
        System.out.println(rcrd);

        //Contain Element
        System.out.println(rcrd.contains(45));
        System.out.println(rcrd.contains(35));

        //Size of ArrayList
        System.out.println(rcrd.size());

        for(int i=0; i<rcrd.size(); i++) {
            System.out.print(rcrd.get(i) + " ");
        }
        System.out.println();
    }
    public static void reversePrintArrayList(ArrayList<Integer> rcrd) {
        for(int i=rcrd.size()-1; i>=0; i--) {
            System.out.print(rcrd.get(i) +" ");
        }
        System.out.println();
    }
    public static void maxInArrayList(ArrayList<Integer> rcrd) {
        //O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<rcrd.size(); i++) {
            if(max < rcrd.get(i)) {
                max = rcrd.get(i);
            }

            // or
            
            //max = Math.max(max, rcrd.get(i));
        }
        System.out.println("MAXIMIUM element is " + max);
    }
    public static void swapNumber(ArrayList<Integer> rcrd, int idx1, int idx2) {
        int temp = rcrd.get(idx1);
        rcrd.set(idx1, rcrd.get(idx2));
        rcrd.set(idx2, temp);

    }
    // public static void mul_d_ArrayList(ArrayList<ArrayList<Integer>> ml) {
    //     ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
    //     ArrayList <Interger> list = new ArrayList<>();
    //     list.add(1);    list.add(2);
    //     ml.add(list);

    //     ArrayList<Integer> lsit1 = new ArrayList<>();
    //     lsit1.add(3);   lsit1.add(4);
    //     ml.add(lsit1);
    //     //Print
    //     for(int i=0; i<ml.size(); i++) {    //itrating ml 2d Arraylsit
    //         ArrayList <Integer> currList = mainList.get(i);
    //         for(int j=0; j<currList.size(); j++) {
    //             System.out.print(currList.get(i)+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void form_multi_dim_Array(){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList <Integer> List1 = new ArrayList<>();
        ArrayList <Integer> List2 = new ArrayList<>();
        ArrayList <Integer> List3 = new ArrayList<>();
        for(int k=1; k<=5; k++) {
            List1.add(k*1);
            List2.add(k*2);
            List3.add(k*3);
        }
        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);
        //Print
        for(int i=0; i<mainList.size(); i++) {    //itrating ml 2d Arraylsit
            ArrayList <Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) { 
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
    public static void main(String args[]) {
        ArrayList <Integer> rcrd = new ArrayList<>();
        rcrd.add(2);
        rcrd.add(5);
        rcrd.add(9);
        rcrd.add(3);
        rcrd.add(8);
        


        // System.out.println(rcrd);
        // // reversePrintArrayList(rcrd);
        // // maxInArrayList(rcrd);
        // int idx1 = 1 , idx2 =3;
        // swapNumber(rcrd, idx1, idx2);
        // System.out.println(rcrd);
       
        
    }
}