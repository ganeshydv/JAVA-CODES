package Array_Leet_code_problems.__leet_with_q;
//problem:

//There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
//
//For each location indices[i], do both of the following:
//
//Increment all the cells on row ri.
//Increment all the cells on column ci.
//Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
//
//
//
//Example 1:
//
//
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
//Example 2:
//
//
//Input: m = 2, n = 2, indices = [[1,1],[0,0]]
//Output: 0
//Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
//
//
//Constraints:
//
//1 <= m, n <= 50
//1 <= indices.length <= 100
//0 <= ri < m
//0 <= ci < n
public class cell_with_odd_cells_matrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        int row=0;
        int col=0;
        for(int i=0;i<indices.length;i++)
        {
            row=indices[i][0];
            col=indices[i][1];
            for(int j=0;j<arr[row].length;j++)
            {
                arr[row][j]=arr[row][j]+1;
            }
            for(int j=0;j<arr.length;j++)
            {
                arr[j][col]=1+arr[j][col];
                // if(j+1<arr.length){
                //     j++;
                // }else break;
                // arr[j][col]= 1+arr[j][col];
            }

        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1 || arr[i][j]%2!=0 )
                {
                    count++;
                }
            }
        }
        return count;
    }
}
