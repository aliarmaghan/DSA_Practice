import java.util.*;



public class Bill {
    public static void main(String [] args) {
        System.out.println("ENTER price of pencil");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter price of pen");
        float b = sc.nextFloat();
        System.out.println("Enter price of eraser");
        Float c = sc.nextFloat();
        float t =  a + b + c;
        System.out.println("Total cost = " +t);
    
        // Adding 18% Gst

        float g = 0.18f * t;
        float gst = g + t;
        System.out.print("Bill with 18% GST = " +gst);
    }
}