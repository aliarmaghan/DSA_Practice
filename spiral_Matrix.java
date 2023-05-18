import java.util.*;


public class spiral_Matrix{
    public static void main (String args[]){
        int matrix [][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}};
        spiralPrint(matrix);
    }
    public static void spiralPrint(int m[][]){
        int startRow = 0;
        int endRow = m.length-1;
        int startCol = 0;
        int endCol = m[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(m[startRow][j]+" ");
            }
            
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(m[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(m[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i<=startRow+1; i++){
                System.out.print(m[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }
}