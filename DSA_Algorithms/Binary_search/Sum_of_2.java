package Binary_search;

import java.util.Arrays;
//this program is about finding elements indexes whose sum is equals to target .....
public class Sum_of_2 {
    public static void main(String[] args) {
//[5,25,75]
//100
        //[1,2,3,4,4,9,56,90]
        //8
        int[] nums={1,2,3,4,4,9,56,90};
        System.out.println(Arrays.toString(twoSum(nums,8)));  //find elements whose sum is 8
    }
    static int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];


        for(int i=0;i<numbers.length;i++){
            int start=i+1;
            int end=numbers.length-1;
            int a=numbers[i];
            while (start<=end){
                int mid=start+(end-start)/2;
                int sum=a+numbers[mid];
                if(sum==target){
                    arr[0]=i+1;
                    arr[1]=mid+1;
                    return arr;
                }else if(sum<target){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }

        }//for loop end
        return arr;
    }//end method
}
