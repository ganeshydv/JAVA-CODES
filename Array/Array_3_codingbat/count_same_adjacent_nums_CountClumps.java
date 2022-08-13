package Array_3_codingbat;
//Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
//
//
//countClumps([1, 2, 2, 3, 4, 4]) → 2
//countClumps([1, 1, 2, 1, 1]) → 2
//countClumps([1, 1, 1, 1, 1]) → 1
public class count_same_adjacent_nums_CountClumps {
    public int countClumps(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                count++;
                i++;
                while(i+1<nums.length && nums[i]==nums[i+1]){
                    i++;
                }
            }

        }
        return count;
    }

}
