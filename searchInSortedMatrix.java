import java.util.*;


public class searchInSortedMatrix {
    public static void main(String args[]) {
        int matrix [][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        int key = 4;
        System.out.println(stairCaseSearch(matrix, key));

    }
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("Founded key at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
}