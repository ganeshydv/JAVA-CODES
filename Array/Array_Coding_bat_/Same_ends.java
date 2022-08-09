public class Same_ends {
    public static void main(String[] args) {
        int[] arr={5, 6, 45, 99, 13, 5, 6};
        boolean b=sameEnds(arr,2);
        System.out.println(b);
    }
    static boolean sameEnds(int[] nums, int len) {
        int[] arr1=new int[len];
        int[] arr2=new int[len];
        for(int i=0;i<len;i++){
            arr1[i]=nums[i];
        }
        int start=nums.length-len;
        int k=0;
        for(int i=start;i<nums.length;i++){
            arr2[k]=nums[i];
            k++;
        }
        int count=0;
        for(int i=0;i<len;i++){
            if(arr1[i]==arr2[i]){
                count++;
            }
        }
        if(count==len){
            return true;
        }
        return false;
    }
}
