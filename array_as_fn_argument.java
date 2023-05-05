import java.util.*;


class aray_as_fn_argument{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static int linear_search(int n[], int key){
        //index of element
        for(int i=0; i<n.length; i++){
            if(n[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int menuu(String m[],String key){
        for(int i=0; i<m.length; i++){
            if(m[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;    //-INFINITE =   use Integer.MIN_VALUE
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        Strinig m[] = {"dosa","samosa","itdli","chewmin"};
        String key ="samosa";
    
        System.out.println(menuu(m, key));

        }
    }   