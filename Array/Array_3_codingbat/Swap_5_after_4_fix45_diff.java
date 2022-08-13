package Array_3_codingbat;
//
//(This is a slightly harder version of the fix34 problem.)
// Return an array that contains exactly the same numbers as the given array,
// but rearranged so that every 4 is immediately followed by a 5.
// Do not move the 4's, but every other number may move.
// The array contains the same number of 4's and 5's, and
// every 4 has a number after it that is not a 4. In this version,
// 5's may appear anywhere in the original array.
//
//
//        fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
//        fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
//        fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
public class Swap_5_after_4_fix45_diff {
    public int[] fix45(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==4 && i+1<nums.length && nums[i+1]!=5)
            {
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]==5 && j==0 &&nums[i+1]!=4){
                        int a=nums[i+1];
                        nums[j]=a;
                        nums[i+1]=5;
                        i++;
                        // break;
                    }
                    if(nums[j]==5 && j-1>=0 && nums[j-1]!=4 &&nums[i+1]!=4){
                        int a=nums[i+1];
                        nums[j]=a;
                        nums[i+1]=5;
                        i++;
                        break;
                    }
                }
            }

        }

        return nums;
    }

}
