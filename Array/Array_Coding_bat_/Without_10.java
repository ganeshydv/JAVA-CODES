public class Without_10 {
     static int[] withoutTen(int[] nums) {
        int index=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==10){
                nums[i]=0;

            }else
            if(nums[i]!=0){
                a=nums[i];
                nums[index]=a;

                if(i!=index) nums[i]=0;
                index++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr={1, 10, 10, 2};
        int[] a=withoutTen(arr);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
