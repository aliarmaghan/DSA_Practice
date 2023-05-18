import java.util.*;


public class IIdArray{
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key founded at cell("+i+ ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not founded");
        return false;
    }
    public static void large_small(int matrix[][]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                large = Math.max(matrix[i][j],large);
                small = Math.min(matrix[i][j],small);
            }
        }
        System.out.println("largest value of matrix is = "+large);
        System.out.println("smallest value of matrix is = "+small);
    }
    public static void main(String args[]){
        int matrix[][] = new int [3][3];

        //scan
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //print
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 6);
        large_small(matrix);

    }
}