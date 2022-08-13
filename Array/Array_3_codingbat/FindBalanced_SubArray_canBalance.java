package Array_3_codingbat;
//Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//
//canBalance([1, 1, 1, 2, 1]) → true
//canBalance([2, 1, 1, 2, 1]) → false
//canBalance([10, 10]) → true
public class FindBalanced_SubArray_canBalance {
    public boolean canBalance(int[] nums) {
        int sum_left=0;

        for(int i=0;i<nums.length;i++)
        {
            int sum_right=0;
            sum_left=sum_left+nums[i];

            for(int j=nums.length-1;j>i;j--){
                sum_right=sum_right+nums[j];
            }
            if(sum_right==sum_left){
                return true;
            }
        }
        return false;

    }


}
