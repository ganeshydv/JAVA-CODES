class isEverywhere{
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 3};
        boolean b=isEverywhere(arr,1);
        System.out.println(b);
    }

    static boolean isEverywhere(int[] nums, int val) {
        int a=0;
        int b=0;
        for(int i=1;i<nums.length;i++){

            if(i+1<nums.length && nums[i-1]==val && nums[i+1]==val){

                a=1;
                i++;
            }else if(i==nums.length-1){
                a=a;
            }else a=0;
            if(i>=2 && a!=1) break;
        }
        if(a==1)
        {
            return true;

        }

        return false;
    }

//    static boolean isEverywhere_(int[] nums, int val) {
//        int i=0;
//        int j=0;
//        while(i<nums.length){
//            if(nums[i]==val){
//                j=i+2;
//                while(j<nums.length){
//                    if(nums[j]==val){
//                        j=j+2;
//                    }else return false;
//                    if(j>nums.length) return false;
//                }
//
//            }
//            i++;
//        }
//        return false;
//    }

}