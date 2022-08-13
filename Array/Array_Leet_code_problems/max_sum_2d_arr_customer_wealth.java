package Array_Leet_code_problems.__leet_with_q;
//question

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//
//
//
//Example 1:
//
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.
//Example 2:
//
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
//Explanation:
//1st customer has wealth = 6
//2nd customer has wealth = 10
//3rd customer has wealth = 8
//The 2nd customer is the richest with a wealth of 10.
//Example 3:
//
//Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//Output: 17
//
//
//Constraints:
//
//m == accounts.length
//n == accounts[i].length
//1 <= m, n <= 50
//1 <= accounts[i][j] <= 100
public class max_sum_2d_arr_customer_wealth {
    public int maximumWealth(int[][] accounts) {

        int a=0;
        int[] arr=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int x=0;
            for(int j=0;j<accounts[i].length;j++){
                x=x+accounts[i][j];

            }
            arr[i]=x;
        }
        for(int i=0;i<arr.length;i++){
            if(arr.length==1){
                a=arr[0];
                break;
            }
            if(i==arr.length-1){
                break;
            }
            if(arr[i]>arr[i+1]){
                a=arr[i];
                arr[i+1]=a;
            }else{
                a=arr[i+1];
            }
        }
        return a;
    }
}
