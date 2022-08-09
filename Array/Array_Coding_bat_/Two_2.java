public class Two_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
       boolean b= twoTwo(arr);
        System.out.println(b);
    }
    static boolean twoTwo(int[] nums) {
        int k=0;
        int n=0;
        int m=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==2 && nums[i]==2){
                k=2;
                i++;
            }else if(nums[i]==2){
                k=1;
            }else m=1;


        }
        if(m==1 ) return true;
        if(k==2 ||  m==1 ) return true;
        return false;
//        for(int i=1;i<nums.length;i++){
//            if( nums[i]==2){
//                if(i+1<nums.length && nums[i+1]!=2) n=1;
//                // i++;
//            }
//            if(nums[i-1]==2 && nums[i]==2){
//                k=2;
//
//            }
//            // i++;
//
//        }
//        if(k==2 && n!=1 ) return true;
//        return false;
    }
}
