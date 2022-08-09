class Leet_arr_index{
	public static void main(String[] args) {
		int [] x={-1,-2,-3,-4,-5};
		// [-1,-2,-3,-4,-5]
// -8
		// System.out.print(twoSum(x,6));
		twoSum(x,-8);
	}
	   static public int[] twoSum(int[] nums, int target) {
        int[] a= new int[2];
        for(int i =0;i<nums.length-1;i++){
        	// System.out.println(i);
            for(int j=1;j<nums.length;j++){
            	// System.out.println(i);

                if(nums[i]+nums[j]==target){
                	if(i==j){
                		continue;
                	}
                	else{
                    a[0]=i;
                    a[1]=j;
                    break;
                	}
                	
                }

            }
        }
        for(int z:a){
        	System.out.println(z);
        }
        return a;
    }
}