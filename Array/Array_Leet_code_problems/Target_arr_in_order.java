class Target_arr_in_order{

	public static void main(String[] args) {
		int[] nums={0,1,2,3,4};
		int[] index={0,1,2,2,1};
		createTargetArray(nums,index);
	}
	
	static void createTargetArray(int[] nums, int[] index) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        	int x=index[i];                        //index array se current index liya...isi index par nums ki value arr array me deni hai...
        	if(x<i){                               //move only if the element to be inserted at index x is less than index of array...
        		for(int k=nums.length-1;k>x;k--){  //to move element by index 1 to left......
        			arr[k]=arr[k-1];
        		}
        	}
        	arr[x]=nums[i];    //x ki jaga par i ki value insert karna..
           
        }
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }
    }
}