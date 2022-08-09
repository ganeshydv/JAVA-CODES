public class Triple_up {
    public static void main(String[] args) {
        int[] arr={1, 4, 5, 6, 2};
        boolean b=tripleUp(arr);
        System.out.println(b);
    }
    static boolean tripleUp(int[] nums) {
        for(int i=2;i<nums.length;i++){
            int a=nums[i-2];
            int b=nums[i-1];
            int c=nums[i];
            if(c==b+1 && b==a+1){
                return true;
            }
        }
        return false;
    }
}
