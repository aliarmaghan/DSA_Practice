public class bitAssignment{
    public static void swapNumber (int a ,int b){
        System.out.println("value of a = " + a +" and b = " +b +  " BEFORE swap");
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("value of a = " +a +" and b = " +b +  " AFTER swap" );
    } 
    public static void main (String args[]) {
        swapNumber(5,6);
    }
}