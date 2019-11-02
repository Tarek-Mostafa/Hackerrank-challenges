
/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * Link to challenge: https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
 
import java.lang.*;

public class DiagonalDiffernce
{
    public static void main(String[] args) {
        testDiagonalDiff();
    }
    
    public static int getDiagonalDifference() {
          int arr[][] = {
          {11,2,4},
          {4,5,6},
          {10,8,-12}
        };
        
        int LTR = 0;
        int RTL = 0;
        int diagonalDiffernce = 0;
        
        for(int i = 0; i<arr.length; i++) {
            LTR += arr[i][i];
            RTL += arr[i][arr.length - 1 - i];
        }
        
        diagonalDiffernce = Math.abs(LTR-RTL);
        return(diagonalDiffernce);
    }
    
    public static void testDiagonalDiff() {
        int x = getDiagonalDifference();
        System.out.println(x);
    }
}
