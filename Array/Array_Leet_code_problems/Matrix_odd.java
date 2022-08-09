package Array_Leet_code_problems;

public class Matrix_odd {
    public static void main(String[] args) {
        int[][] arr={{0,1},{1,1}};
        int odd=oddCells(2,3,arr);
        System.out.println(odd);
  }
    static int oddCells(int m, int n, int[][] indices) {
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
                if(j+1< arr.length) {
                j++;
                }else break;
//                arr[j][col]= 1+arr[j][col];
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
