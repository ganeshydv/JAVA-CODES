package Array_Leet_code_problems.__leet_with_q;
//question

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]
//
//
//Constraints:
//
//1 <= nums.length <= 1000
//-10^6 <= nums[i] <= 10^6
public class sum_of_previous_running_sum {
    public int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                arr[0]=nums[0];
            }else{
                arr[i]=arr[i-1]+nums[i];
            }
        }
        return arr;
    }
}
