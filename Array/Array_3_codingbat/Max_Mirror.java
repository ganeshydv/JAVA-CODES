public class Max_Mirror {
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        int a=maxMirror(arr);
        System.out.println(a);
    }

    static int maxMirror(int[] nums) {
        int count=0;
        int count_2=0;
        int max=0;
        int j=0;
        int index1=nums.length-1;

        for(int i=0;i<nums.length;i++)
        {   //---------- if same element continuous repeating----------
            if(i-1>=0 &&nums[i]==nums[i-1]){
                count_2++;
                if(i+1<nums.length && (nums[i]==nums[i+1])){
                    count_2++;
                }
            }else count_2=0;

            //---------------for comparing----------------
            for(j=index1;j>=0;j--)
            {

                if(nums[i]==nums[j] && i +1< nums.length && j-1>=0 && nums[i+1]==nums[j-1])
                { count++;
                    index1=j-1;
                    break;
                }else if(nums[i]==nums[j] && j+1< nums.length && i-1>=0 && nums[i-1]==nums[j+1] )
                {
                    count++;
                    index1=j-1;
                    break;
                }else count=0;

            }
            //------------------------block over---------------
            if(count>max)
            {
                max=count;
            }
            if(count_2>max){
                max=count_2;
            }

        }

        return max;
    }

}

