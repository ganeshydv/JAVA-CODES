package Array_Leet_code_problems.__leet_with_q;
//problem

//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

//Example 1:

//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
//Example 2:
//
//Input: mat = [[1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1]]
//Output: 8
//Example 3:
//
//Input: mat = [[5]]
//Output: 5
//
//
//Constraints:
//
//n == mat.length == mat[i].length
//1 <= n <= 100
//1 <= mat[i][j] <= 100

public class Matrix_diagonal_sum {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int start_index=0;
        int last_index=mat.length-1;
        for(int row=0;row<mat.length;row++)
        {
            if(start_index==last_index)
            {
                sum=sum+mat[row][start_index];
            }else{
                sum=sum+mat[row][start_index]+mat[row][last_index];
            }

            start_index++;
            last_index--;

        }
        return sum;
    }//end of method
}
