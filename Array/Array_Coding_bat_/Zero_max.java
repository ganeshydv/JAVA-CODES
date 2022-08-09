public class Zero_max {
    public static void main(String[] args) {
        int[] arr={7, 0, 4, 3, 0, 2};
        int[] arr2=zeroMax(arr);
        for(int i:arr2){
            System.out.print(i+" ");
        }
    }
    static int[] zeroMax(int[] nums) {
        int max1=0;
        int max2=0;
        int z=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2!=0 ){
                        max1=nums[j];
                        z=j;
                        nums[i]=max1;
                        break;
                    }
                }
                for(int k=z+1;k<nums.length;k++){
                    if(nums[k]%2!=0 ){
                        max2=nums[k];
                        if(max2>=max1){
                            max1=max2;
                        }

                        nums[i]=max1;
                        // break;
                    }

                }
            }
        }
        return nums;
    }

}
