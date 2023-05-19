import java.util.*;


public class IID_Assignment{
    // Bruteforce Approach
    public static void count(int array[][], int key) {
        int count = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++) {
                if(array[i][j] == key){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
    public static void rowSum(int array[][]) {
        int sum =0;
        for(int j=0; j<array[0].length; j++) {
            sum += array[1][j];
        }
        System.out.println("Sum of Second row is = "+sum);
    }
    public static void transposeMatrix(int matrix[][]) {
        int row = 2, column = 3;
        int transpose [][] = new int [column][row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
    //     int array [][] = {{4,7,8},
    //                       {8,8,7}};
    //     int key = 7;
    //     count(array,key);
    // int array[][] = {{1,4,9},{11,4,3},{2,2,3}};
    // rowSum(array);
    int matrix[][] = {{2,3,7},{5,6,7}};
        System.out.println("The matrix is : ");
        printMatrix(matrix);
        System.out.println("Transpose matrix is : ");
        transposeMatrix(matrix);
        
    }
}