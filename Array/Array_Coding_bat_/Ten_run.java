public class Ten_run {
    public static void main(String[] args) {
        int[] arr={1, 2, 50, 1};
        int[] arr2=tenRun(arr);
        for(int i:arr2){
            System.out.print(i+" ");
        }
    }
    static int[] tenRun(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%10==0){
                a=nums[i];
                if(i+1>=nums.length) break;
                if(nums[i+1]%10==0 && nums[i+1]!=a ){
                   i++;
                   a=nums[i];    
                }
                
                nums[i+1]=a;
            }
            
        }
        return nums;
    }

}
