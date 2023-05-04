import java.util.*;



public class Advance_pattern{

    public static void Hollow_rec(int r,int c){
        for(int i=1; i<=r; i++){
            for (int j=1; j<=c; j++){
                if (i==1 || i==r ||j == 1 ||j == c){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void inverted_rotated_half_pyramid(int n){
        // No. of rows
        for (int i=1; i<=n; i++){
            
            
            // No. of space
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            
            
            //No. of star
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }


    public static void inverted_half_pyramid_with_number(int n){

        //No of rows
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_Triangle(int n){
        int c=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void Triangle0_1(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int n){
        //1 Half Number of rows

        for(int i=1; i<=n; i++){
           
            //Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space 2*(n-i)
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2 Half 

        for(int i=n; i>=1; i--){

              //Star
              for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space 2*(n-i)
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Solid_Rhombus(int n){
        
        //Number of rows
        for(int i=1; i<=n; i++){
            //space (n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Star 
            for (int j=1; j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void hollow_Rohmbus(int n){
        for (int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Hollow rohmbus(rectangle)
            for(int j=1; j<=n; j++){
                if ( i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
        public static void Diamond_pattern(int n){
            
            //1 half

            for (int i=1; i<=n; i++){
                for (int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //2 Half

            for (int i=n; i>=1; i--){
                for (int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Diamond_pattern(n);
    }
}